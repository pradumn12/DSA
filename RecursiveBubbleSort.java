public class RecursiveBubbleSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};//13 24 46 20 9 52
        int n = arr.length;
        recursive_bubble_sort(arr,n);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void recursive_bubble_sort(int[] arr,int n){

        if(n==1) return;
        for(int j=0;j<n-1;j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
        recursive_bubble_sort(arr, n-1);

    }
}
