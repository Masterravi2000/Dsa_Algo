public class Q2 {
    public static void SelectionSort(String[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int min = i;
            for(int j=i;j<n;j++){
                if(arr[min].compareTo(arr[j])>0){
                    min = j;
                }
            }
            //once the minimum is found swap
            String t = arr[i];
            arr[i] = arr[min];
            arr[min] = t;
        }
    }

    public static void main(String[] args){
        String[] arr = {"papaya","lime","watermelon","apple","mango","kiwi"};
        System.out.print("Given array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        SelectionSort(arr);
        System.out.print("Sorted array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
