public class RemoveDuplicatesfromSortedArray_Optimised {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        int result = Solution(arr);
        System.out.println("Size of unique element: "+result);
    }
    public static int Solution(int[] arr){

        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;


    }
}
