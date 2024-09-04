//select minimum and swap
public class SelectionSort{
    public static void main(String[] args) {
        int arr[] = {7,5,9,2,8};
        int result[] = selection_sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(result[i]+" ");
        }
    }
    public static int[] selection_sort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            int mini = i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[mini]>arr[j]){
                    mini = j;
                }
            }
            int temp = arr[mini];
            arr[mini] = arr[i];
            arr[i] = temp;
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+" ");
            }
        }
        return arr;
    }
}