//Adjacent compare and adjacent swap

public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {13,46,24,52,20,9};//13 24 46 20 9 52
        int result[] = bubble_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] bubble_sort(int[] arr){
        int n = arr.length;//6
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }
}
