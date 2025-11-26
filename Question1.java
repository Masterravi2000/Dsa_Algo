public class Question1 {
    public static void Sort(int[] arr){
        int n = arr.length;
        if(n<=1) {//handling corner or edge cases
            System.out.println("Given array is too small to be sort");
            return;
        }
        int x = -1;
        int y = -1;
        for(int i=1;i<n;i++){
            if(x<0 && arr[i]<arr[i-1]){
                x = i-1;
                continue;
            }
            if(x>=0 && arr[i]<arr[i-1]){
                y = i;
                continue;
            }
        }
        if(x>=0 && y>=0){
            int t = arr[x];
            arr[x] = arr[y];
            arr[y] = t; 
        }
        else {
            int t = arr[x];
            arr[x] = arr[x+1];
            arr[x+1] = t;
        }
    }
    public static void main(String[] args){
        //Given an array where all its elements are sorted in increasing order except two swapped elemetns, sort it in liner time. Assume there are no duplicates in the array
        int[] arr = {1,2,9,4,5,6,7,8,3};
        System.out.println("Given array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        Sort(arr);
        System.out.println("array sorted - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
