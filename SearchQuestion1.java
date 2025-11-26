public class SearchQuestion1 {
    public static int binarySearch(int[] arr,int x,int s,int e){
        //find the mid
        int mid = s+(e-s)/2;
        int first_oc = mid;
        //base case
        if(s>e) {
            int n = arr.length;
            if(mid==n) return -1;
            else return first_oc;
        }
        //now check
        if(arr[mid]==x){
            first_oc = mid;
            return binarySearch(arr,x,s,mid-1);
        }
        else if(arr[mid]<x){
            return binarySearch(arr,x,mid+1,e);
        }
        else if(arr[mid]>x){
            return binarySearch(arr,x,s,mid-1);
        }
        else {
            return -1;
        }
    }
    //find the first occurence of the given target x if found return its index if not return -1
    public static void main(String[] args){
        int[] arr = {1,2,2,5,5,5,5,5,6,6,6};
        int n = arr.length;
        int x = 5;
        int s = 0;
        int e = n-1;
        System.out.println("Given array is - ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        System.out.println("Print the index of first occurence of target 5");

        int index_of_first_occurence = binarySearch(arr,x,s,e);
        System.out.println("Index of first occurence found using Binary Search is - "+index_of_first_occurence);

    }
}
