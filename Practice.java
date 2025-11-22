public class Practice {
    public static int particision(int[] arr,int s, int e){
        //first hold a value as pivot let say k
        int count = 0;
        //now place this kth value to its correct position
        for(int i=s+1;i<=e;i++){
            //now count the smaller number from the holded pivot
            if(arr[s]>=arr[i]){
                count++;
            }
        }
        //now place the holded pivvot k after total counted value which will be the pivot index
        int p = s+count;
        //now swap the kth and pivot index values in array
        int t = arr[s];
        arr[s] = arr[p];
        arr[p] = t;

        //now bring all the smaller values in the right of the pivot and all the greater value in the left of the pivot
        int i = s;
        int j = e;
        while(i <= p && j >= p){
            if(arr[i]>=arr[p] && arr[j]<=arr[p]){
                //swap
                int t2 = arr[i];
                arr[i] = arr[j];
                arr[j] = t2;
                i++;
                j--;
            }
            else if(arr[i]>=arr[p]){
                j--;
            }
            else if(arr[j]<=arr[p]){
                i++;
            }
            else {
                i++;
                j--;
            }
        }
        return p;
    }
    public static void QuickSort(int[] arr,int s,int e){
        //base case for stoping the recusion
        if(s>=e) return;
        //find the pivot value
        int p = particision(arr,s,e);

        //now throw the left part into recursion for sorting
        QuickSort(arr,s,p-1);
        //now throw the right part into the recusion for sorting
        QuickSort(arr,p+1,e);
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

        QuickSort(arr,s,e);

        System.out.println("Sorted array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
