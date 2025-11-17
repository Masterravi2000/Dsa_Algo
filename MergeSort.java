public class MergeSort {
    public static void merge(int[] arr,int s,int mid,int e){
        int[] L = new int[mid-s+1];
        int[] R = new int[e-mid];
        int k = 0;
        for(int i=s;i<=mid;i++){
            L[k] = arr[i];
            k++;
        }
        k = 0;
        for(int i=mid+1;i<=e;i++){
            R[k] = arr[i];
            k++;
        }

        int i = 0;
        int j = 0;
        k = s;
        while(i < L.length && j < R.length){
            if(L[i]>R[j]){
                arr[k] = R[j];
                j++;
                k++;
            }
            else {
                arr[k] = L[i];
                i++;
                k++;
            }
        }

        while(i<L.length){
            arr[k] = L[i];
            i++;
            k++;
        }
        while(j < R.length){
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void mergeSort(int[] arr, int s, int e){
        if(s>=e) return;
        int mid = (s+e)/2;

        //for Left
        mergeSort(arr,s,mid);
        //for Right
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    public static void main(String[] args) {
        int[] arr = { 2, 6, 3, 9, 7, 8, 1, 4 };
        int n = arr.length;
        int s = 0;
        int e = n-1;

        System.out.print("Given array - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }

        mergeSort(arr,s,e);

        System.out.println();
        System.out.print("Sorted array using Merge sort - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
    }
}
