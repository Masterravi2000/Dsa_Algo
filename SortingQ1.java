
public class SortingQ1 {
    public static void Sorting(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1;j++){
                if(arr[j]==0 && arr[j+1]!=0 ){
                    //swap
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {0,5,0,3,42};
        System.out.println("Given array -");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        Sorting(arr);
        System.out.println("Sorted array -");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
