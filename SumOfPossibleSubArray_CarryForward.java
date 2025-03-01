public class SumOfPossibleSubArray_CarryForward {
    public static void main(String[] args) {
        
    int[] arr = new int[]{1,2,3,4};
    int N = arr.length;
    int sum = sumOfAllSubArray(arr,N);
    System.out.println("Sum of all Sub-array is: "+sum);

    }
    public static int sumOfAllSubArray(int[] A,int size){

        int ans = 0;
        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=i;j<size;j++){
                sum+=A[j];
                ans+=sum;
            }

        }

        return ans;
    }
    
}


