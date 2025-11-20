public class Practice {
    //creating the swap method in order to eliminate repetations
    public static void swap(int[] arr,int i,int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
    public static int particion(int[] arr,int s,int e){
        int count = 0;
        //now bring this in its correct place
        for(int i=s+1;i<=e;i++){
            if(arr[s]>=arr[i]){
                count++;
            }
        }
        int p = s+count;
        //now Swap to place the pivot to its right place
        swap(arr,p,s);

        //now bring the smaller element to the left and larger element to the right
        int i = s;
        int j = e;
        while(i<=p && p<=j){
            if(arr[i] > arr[p] && arr[j] < arr[p]){
                //swap
                swap(arr,i,j);
                i++;
                j--;
            }
            else if(arr[i] > arr[p]){
                j--;
            }
            else if(arr[j] < arr[p]){
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
        if(s>=e) return;
        int p = particion(arr,s,e);

        //now throw the left part into the recursion to sort
        QuickSort(arr,s,p-1);
        //and further throw the right part into recursion to sort
        QuickSort(arr,p+1,e);
    }
    public static void main(String[] args){
        int[] arr = {7,13,8,5,10,4,2};
        int n = arr.length;
        int s = 0;
        int e = n-1;
        System.out.println("Given array -");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        QuickSort(arr,s,e);

        System.out.println("Sorted Array - ");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
