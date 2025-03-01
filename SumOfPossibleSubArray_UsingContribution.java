/*T.C O(N) S.C O(1) */
public class SumOfPossibleSubArray_UsingContribution {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};// 1 12 123 2 23 3
        int size = arr.length;
        int sum = contribution(arr, size);
        System.out.println("Sum of all possibe sub-array: "+sum);

    }
    public static int contribution(int[] A, int size){
        int sum =0, contribution = 0;    
        for(int i=0;i<size;i++){
                contribution=(i+1)*(size-1-i+1); 
                sum+=contribution*A[i]; 
                // (i+1)*(N-i)*A[i]
            }
            return sum;
    }
}
