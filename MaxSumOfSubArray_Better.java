/*Incorrect answer as j is moving from i till N   T.C O(N2)
 * 
 * This approach is giving maximum sum for
 *  1 2 3 4 -10 = 0 <-- Max
 *  2 3 4 -10 = -1
 *  3 4 -10 = -3
 *  4 -10 = -6
 *  -10 = -10
*/
public class MaxSumOfSubArray_Better {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,-10};
        int N = arr.length;
        SumOfArray(arr, N);

    }

    public static void SumOfArray(int[] A, int N){

        int sum = 0;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            sum=0;
            for(int j=i;j<N;j++){
                sum+=A[j];
            }
            if(sum>max){
                max = sum;
            }
        }
        System.out.println("Max value in a sub-array is: "+max);
    }
    
}
