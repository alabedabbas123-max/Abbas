package sun.misc;

public class RequestProcessor implements Runnable {
    private static Thread dispatcher;
    private static Queue requestQueue;

    public static void postRequest(Request req) {
        lazyInitialize();
        requestQueue.enqueue(req);
    }

    @Override
    public void run() {
        lazyInitialize();
        while (true) {
            try {
                Object obj = requestQueue.dequeue();
                if (obj instanceof Request) {
                    Request req = (Request) obj;
                    try {
                        req.execute();
                    } catch (Throwable th) {
                    }
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static synchronized void startProcessing() {
        if (dispatcher == null) {
            Thread thread = new Thread(new RequestProcessor(), "Request Processor");
            dispatcher = thread;
            thread.setPriority(7);
            dispatcher.start();
        }
    }

    private static synchronized void lazyInitialize() {
        if (requestQueue == null) {
            requestQueue = new Queue();
        }
    }
}
