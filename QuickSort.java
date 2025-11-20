public class QuickSort {
    public static int particion(int[] arr, int s, int e) {
        int count = 0;
        for (int i = s + 1; i <= e; i++) {
            if (arr[s] > arr[i]) {
                count++;
            }
        }
        // now calculate the exact position and place the pivot
        int p = s + count;
        // now swap to place the pivot into its correct place
        int t = arr[s];
        arr[s] = arr[p];
        arr[p] = t;

        // now bring the smaller element to the left and larger to right of pivot
        int i = s;
        int j = e;
        while (i<=p && p<=j) {
            if (arr[i] > arr[p] && arr[j] < arr[p]) {
                // swap
                int t2 = arr[i];
                arr[i] = arr[j];
                arr[j] = t2;
                i++;
                j--;
            } else if (arr[i] > arr[p]) {
                j--;
            } else if (arr[j] < arr[p]) {
                i++;
            } else {
                i++;
                j--;
            }
        }
        return p;
    }

    public static void quickSort(int[] arr, int s, int e) {
        if (s >= e)
            return;
        int p = particion(arr, s, e);
        // call recursion for sorting left
        quickSort(arr, s, p - 1);
        // call recursion for sorting right
        quickSort(arr, p + 1, e);
    }

    public static void main(String[] args) {
        int[] arr = { 7, 13, 8, 5, 10, 2, 4 };
        int n = arr.length;
        int s = 0;
        int e = n - 1;
        System.out.println("Given Array - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();

        quickSort(arr, s, e);

        System.out.println("Sorted Array - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
