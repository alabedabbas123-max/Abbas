package sun.misc;

public class Sort {
    private static void swap(Object[] arr, int i, int j) {
        Object tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void quicksort(Object[] arr, int left, int right, Compare comp) {
        if (left >= right) {
            return;
        }
        swap(arr, left, (left + right) / 2);
        int last = left;
        for (int i = left + 1; i <= right; i++) {
            if (comp.doCompare(arr[i], arr[left]) < 0) {
                last++;
                swap(arr, last, i);
            }
        }
        swap(arr, left, last);
        quicksort(arr, left, last - 1, comp);
        quicksort(arr, last + 1, right, comp);
    }

    public static void quicksort(Object[] arr, Compare comp) {
        quicksort(arr, 0, arr.length - 1, comp);
    }
}
