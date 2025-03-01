



/* Don't refer its not completed */

public class SumOfPossibleSubArray_PrefixSum {
    public static void main(String[] args) {
        int[] A = new int[]{1,2,3};
        //ps: 1,3,6 
        // (1) (2) (3) (1,2) (2,3)  =14
        int result = sumOfSubArray(A);
        System.out.println("Sum of all Sub-array sum: "+result);
    }
    public static int sumOfSubArray(int[] A){

            int size = A.length;
            int[] ps = new int[size];
            ps[0] = A[0];
            for(int i=1;i<size;i++){
                ps[i] = ps[i-1]+A[i];
            }
            System.out.println("---x----x---x---x---");
            for(int i=0;i<size;i++){
                System.out.print(ps[i]+" ");
            }

            int sum = 0;
            for(int i=0;i<size;i++){
                for(int j=i;j<size;j++){
                    if(j==0){
                        sum+=ps[size-1-j];
                    }else{
                        sum+=(ps[size-1-j]-ps[j-1]);//ps[0]-ps[1]
                    }
                    
                }
            }

        return sum;
    }
}
