/*Finding equilibrium index using Pre-fix Sum method*/
// T.C O(N+q) S.C O(N) for q quries of array question
public class PreFixSubArray_EquilibriumIndex_Optimised {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,8,10};
        int index = findEquilibriumIndex(arr);
        System.out.println("Equilibrium index is: "+index);
    }
    public static int findEquilibriumIndex(int[] A){

        int n = A.length;
        //Creation of cummulative array
        int[] ps = new int[A.length];
        ps[0] = A[0];
        for(int i=1;i<n;i++){
            ps[i] = ps[i-1] + A[i];
        }
        System.out.println("Cummulative array is: ");
        for(int k=0;k<n;k++){
            System.out.print(ps[k]+" ");
        }

        for(int i=1;i<=n-2;i++){
            int left_sum=0, right_sum=0;
            left_sum = ps[i-1];
            right_sum = ps[n-1]-ps[i];
            
            if(left_sum==right_sum){
                return i;
            }
        }

        return -1;
    }
    
}
