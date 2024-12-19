public class KadaneSolutionWithSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        result_optimal(arr);
    }
    public static void result_optimal(int[] arr){

        int n = arr.length;
        int start=-1,end = -1;
        int sum = 0,max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];

            if(sum>max){
                max = sum;
                end  = i;

            }
            if(sum<0){
                sum = 0;
            }
            
        }
        if(end!=-1){//-2,1,-3,4,-1,2,1
            int temp = max;
            for(int i=end;i>=0;i--){
                temp-=arr[i];
                if(temp==0){
                    start = i;
                }

            }
        }
        System.out.println("max sum is: "+max);
        System.out.println("start point is: "+start);
        System.out.println("end point is: "+end);
        System.out.println("Maximum sum sub array is: ");
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
