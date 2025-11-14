
public class BubbleSort {
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            //flag to indicate swapped happened or not
            boolean swapped = false;
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    //now swap
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    swapped = true;
                }
            }
            if(!swapped) return;
        }
    }
    public static void main(String[] args){
        int[] arr = {0,5,0,3,4,2};
        System.out.println("Given Array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        bubbleSort(arr);
        System.out.println("Sorted Array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
