public class MaximumConsecutiveOne{
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 1};
        Solution(arr);
    }
    public static void Solution(int[] arr){
        int n = arr.length;
        int count =0, max_count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                
            }else{
                if(count>max_count){
                    max_count = count;
                }
                count = 0;
            }
        }
        System.out.println("Max_count of 1's are: "+Math.max(count,max_count));
    }
}