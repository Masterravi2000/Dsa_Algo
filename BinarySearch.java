public class BinarySearch {
    public static int binarySearch(int[] arr,int target,int s,int e){
        if(s>e) return -1;
        //find the mid
        int mid = (s+e)/2;
        //now see wether this mid value is equal to target or not
        if(arr[mid]==target){
            return arr[mid];
        }
        else if(arr[mid]<target){
            return binarySearch(arr,target,mid+1,e);
        }
        else if(arr[mid]>target){
            return binarySearch(arr, target, s, mid-1);
        }
        else {
            return -1;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,4,5,7,15,20,24,45,50,77};
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int target = 24;

        System.out.println("From this Givem Array search 24 - ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }

        System.out.println();
        int Target_found = binarySearch(arr,target,s,e);

        System.out.println("Found using Binary Search - "+Target_found);
    }
}
