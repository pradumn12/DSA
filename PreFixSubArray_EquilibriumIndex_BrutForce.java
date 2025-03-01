/*Find an equilibrium index in an array where left-side sum is equal to right-side sum (excluding index i)*/
// T.C O(N2) S.C O(1)
public class PreFixSubArray_EquilibriumIndex_BrutForce {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,8,10};
        int index = findEquilibriumIndex(arr);
        System.out.println("Equilibrium index is: "+index);
    }
    public static int findEquilibriumIndex(int[] A){
        int n = A.length;
        
        for(int i=1;i<=n-2;i++){

            int left_sum = 0, right_sum=0;
            
            for(int j=0;j<=i-1;j++){
                left_sum+=A[j];
            }
            for(int k=i+1;k<=n-1;k++){
                right_sum+=A[k];
            }
            if(left_sum==right_sum){
                return i;
            }

        }
        return -1; // No equilibrium index
    }
    
}
