public class InsertionSort {
    public static void InsertionSort(int[] arr) {
        int n = arr.length;
        for(int i=1;i<n;i++){
            int j = i;
            while(j!=0 && arr[j-1]>arr[j]){
                //Swap
                int t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
                j--;
            }
        }
    }
    //example - [1,2,4,5,3,6]

    public static void main(String[] args) {
        int[] arr = { 7, 3, 5, 2, 4 };
        System.out.println("Given Array - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        System.out.println();
        System.out.println("Array Sorted using Insertion Sort -");
        InsertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
