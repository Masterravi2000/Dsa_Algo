public class Practice {
    public static void merge(int[] arr,int s,int mid, int e){
        //create actual two halves Left and Right
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

        //3 different pointers i for L, j for R and k for arr
        int i = 0;
        int j = 0;
        k = s;
        while(i<L.length && j<R.length){
            if(L[i]>R[j]){
                arr[k] = R[j];
                k++;
                j++;
            }
            else {
                arr[k] = L[i];
                k++;
                i++;
            }
        }
        while(i<L.length){
            arr[k] = L[i];
            k++;
            i++;
        }
        while(j<R.length){
            arr[k] = R[j];
            k++;
            j++;
        }
    }
    public static void mergeSort(int[] arr,int s,int e){
        //base case for stoping the recursion
        if(s>=e) return;
        //divide the array into two equal halves
        int mid = (s+e)/2;

        //throw left part into the recursion for sorting
        mergeSort(arr,s,mid);
        //now throw the right part into the recursion for sorting
        mergeSort(arr, mid+1, e);

        //now merge both sorted left and right part
        merge(arr,s,mid,e);
    }
    public static void main(String[] args){
        int[] arr = {8,7,6,5,4,3,2,1};
        int n = arr.length;
        int s = 0;
        int e = n-1;
        System.out.println("Given array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        mergeSort(arr,s,e);

        System.out.println("Sorted array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
