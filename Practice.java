public class Practice {
    public static int binarySearch(int[] arr,int t,int s,int e){
        int mid = (s+e)/2;
        //base condition
        if(s>e){
            return arr[mid];
        }
        if(arr[mid]==t){
            return arr[mid];
        }
        else if(arr[mid]<t){
            return binarySearch(arr,t,mid+1,e);
        }
        else if(arr[mid]>t){
            return binarySearch(arr,t,s,mid-1);
        }else {
            return -1;
        }
    }
    public static void main(String[] args){
        int[] arr = {2,4,5,7,15,20,24,45,50,77};
        int n = arr.length;
        int t = 24;
        int s = 0;
        int e = n-1;

        System.out.println("Given Array - ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        System.out.println("Find the given target from this sorted array - ");
        int target = binarySearch(arr,t,s,e);
        System.out.println("Got the target using Binary Search - "+target);
    }
}
