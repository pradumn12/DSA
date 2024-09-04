public class RecursiveInsertionSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int n = arr.length;
        recursive_insertion_sort(arr,n,1);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void recursive_insertion_sort(int[] arr,int n,int i){

        if(i==n) return;
        int j = i;
        while(j>0 && arr[j-1]>arr[j]){
            int temp = arr[j-1];
            arr[j-1] = arr[j];
            arr[j] = temp;
            j--;
        }
        recursive_insertion_sort(arr, n, i+1);
    }
}
