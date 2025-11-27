public class Practice {
    public static int binarySearch(int[] arr,int s,int e){
        //find the mid
        int mid = s+(e-s)/2;

        // if(arr[mid])
        return arr[0];
    }
    public static void main(String[] args){
        int[] arr = {2,6,9,5,3,1,7};
        int n = arr.length;
        int t = 9;
        int s = 0;
        int e = n-1
        System.out.println("Given array -");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        int target = binarySearch(arr,s,e);

        System.out.println("Target is - "+t);
        System.out.println("Target found using binary search - "+target);
    }
}
