public class NumberAppearOnce_BF {
    public static void main(String[] args) {
        int[] arr = {1,2,1,2,4};
        Solution(arr);
    }
    public static void Solution(int[] arr){
        int n = arr.length;
        int missing_num  = 0;
        
        for(int i=0;i<n;i++){
            int flag = -1;
            for(int j=0;j<n;j++){

                if(arr[i]==arr[j] && i!=j){
                    flag = 0;
                }
            }
            if(flag == -1){
                missing_num = arr[i];
                System.out.println("Single occurance: "+missing_num);
                break;
            }
        }
    }
}
