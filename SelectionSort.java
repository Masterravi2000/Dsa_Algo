public class SelectionSort {
    public static void SelectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            //find the exact minimun in the current iteration
            for(int j=i+1;j<n;j++){
                if(arr[min] > arr[j]){
                    min = j;
                }
            }
            //Once exact min is found Swap
            int t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 8, 4, 7, 9, 2 };
        System.out.println("Given array - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        SelectionSort(arr);
        System.out.println("Sorted Array using Selection Sort - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
