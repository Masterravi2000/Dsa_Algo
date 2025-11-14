public class Practice {
    public static void Sorting(int[] arr){
        int n = arr.length;
        //Now try insertion sort
        for(int i=1;i<n;i++){
            int j = i;
            while(j!=0 && arr[j-1]>arr[j]){
                //swap
                int t = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = t;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {2,5,3,8,6,9,};
        System.out.println("Given array -");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        Sorting(arr);
        System.out.println("Sorted array using insertion -");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
