// T.C O(N2)  S.C O(N)

public class SubArraywithZeroSum_PreFixSum {
    public static void main(String[] args) {
        int arr[] = {2,2,1,-3,4,3,1,-2,-3};
        int len = arr.length;
        subArraySum(arr,len);
    }
    public static void subArraySum(int arr[],int len){

        int prefix_arr[] = new int[len];
        prefix_arr[0] = arr[0];
        for(int i=1;i<len;i++){
            prefix_arr[i]= prefix_arr[i-1] + arr[i];
        }
        //2,2,1,-3,4,3,1,-2,-3
        for(int i=0;i<len;i++){
            int sum = 0;
            for(int j=i;j<len;j++){
                if(i==0){
                    sum = prefix_arr[j];
                }else{
                    sum = prefix_arr[j] - prefix_arr[i-1];
                }
                if(sum==0){
                    System.out.println("Start index: "+i+" end index: "+j);
                }
                
            }
        }



    }

    
}
