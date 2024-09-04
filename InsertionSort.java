public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};
        int res[] = insertion_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }


    public static int[] insertion_sort(int[] arr){

        for(int i=0;i<arr.length;i++){
            int j = i;
            while(j>0 && arr[j-1] > arr[j]){
                int temp = arr[j-1];
                arr[j-1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        return arr;
    }

}    

