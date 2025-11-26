public class Question2 {
    public static void Sort(int[] arr,int s,int e){
        int i = s;
        int j = e;
        while(i!=j){
            if(arr[i]>=0 && arr[j]<0){
                //swap
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                i++;
                j--;
            }
            else if(arr[i]>=0){
                j--;
            }
            else if(arr[j]<0){
                i++;
            }
            else {
                i++;
                j--;
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {19,-20,7,-4,-13,11,-5,3};
        int n = arr.length;
        int s = 0;
        int e = n-1;
        System.out.println("Given Array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        Sort(arr,s,e);

        System.out.println("Sorted array - ");
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}
