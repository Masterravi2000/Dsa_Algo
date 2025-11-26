public class Question3 {
    public static void Sort(int[] arr){
        int n = arr.length;
        int lo = 0;
        int hi = n-1;
        int mid = lo;
        for(int i=0;i<n;i++){
            if(arr[mid] == 0){
                //swap
                int t = arr[mid];
                arr[mid] = arr[lo];
                arr[lo] = t;
                lo++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else if(arr[mid] == 2){
                //swap
                int t = arr[mid];
                arr[mid] = arr[hi];
                arr[hi] = t;
                hi--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {0,2,1,2,0,0};
        System.out.println("Given array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        Sort(arr);
        
        System.out.println("Sorted array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    } 
}
