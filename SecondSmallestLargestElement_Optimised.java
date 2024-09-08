public class SecondSmallestLargestElement_Optimised {
    public static void main(String[] args) {
        int[] arr = {1,2,4,7,7,5};
        Solution(arr);
    }
    public static void Solution(int[] arr){

        int n = arr.length;
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(small>arr[i]){
                second_small = small;
                small = arr[i];
            }
            if(second_small>arr[i] && arr[i]!=small){
                second_small = arr[i];
            }
        }
        System.out.println(second_small);
        for(int i=0;i<n;i++){
            if(arr[i]>large){
                second_large = large;
                large = arr[i];
            }
            if(arr[i]>second_large && arr[i]!=large){
                second_large = arr[i];
            }
        }
        System.out.println(second_large);

    }

}
