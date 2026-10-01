package a.b.g;

import a.b.b;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class az implements Interfacen {

    private static final int f365a;

    private final Interfacebb f366b;

    static {
        Integer numValueOf = null;
        try {
            String property = System.getProperty("parallel.threads");
            if (property != null) {
                numValueOf = Integer.valueOf(Integer.parseInt(property));
            }
        } catch (Exception e) {
        }
        f365a = Integer.valueOf(numValueOf == null ? Runtime.getRuntime().availableProcessors() - 1 : Math.min(numValueOf.intValue(), Runtime.getRuntime().availableProcessors())).intValue();
    }

    public az(Interfacebb interfaceC0124bb) {
        this.f366b = interfaceC0124bb;
    }

    @Override
    public void mo951a(b bVar) {
        if (f365a <= 1) {
            bVar.a(this.f366b.mo1026a());
            return;
        }
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(f365a, new ThreadFactorybd(this));
        be c0127be = new be(executorServiceNewFixedThreadPool);
        bVar.a(c0127be);
        try {
            executorServiceNewFixedThreadPool.shutdown();
            c0127be.m1029a();
        } catch (InterruptedException e) {
            throw new RuntimeException("Parallel execution is taking too long", e);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2.getCause());
        }
    }
}
