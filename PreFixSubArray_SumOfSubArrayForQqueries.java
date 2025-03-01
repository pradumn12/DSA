/*Given an array of N with q queries. Find the sum of sub-array starting with l and ending with r */
//Brut force method T.C = O(q*N) S.C = O(1) & Optimised approach T.C = O(q+N) S.C = O(N)
public class PreFixSubArray_SumOfSubArrayForQqueries{

    public static void main(String[] args) {
        int arr[] = new int[]{-3,6,2,4,5,2,8,-9,3,1};
        int l = 1, r = 3;
        //int sum = sumOfSubArray_BrutForce(arr,l,r);
        int sum = sumOfSubArray_Optimised(arr,l,r);
        System.out.println("Sum of Sub-array starting from index "+l+" and ending with "+r+" is: "+sum);

    }
    public static int sumOfSubArray_BrutForce(int[] A, int start, int end){
        int sum = 0;    
        for(int i=start;i<=end;i++){
                sum+=A[i];
            }
        return sum;

    }
    public static int sumOfSubArray_Optimised(int[] A, int start, int end){

        int sum = 0;
        int ps[] =new int[A.length];
        ps[0] = A[0];
        // Creation of prefix sum in a new array
        for(int i=1;i<A.length;i++){
            ps[i] = ps[i-1]+A[i];
        }
        // Printting of new pre-fix sub-array
        System.out.println("Cummulative array is: ");
        for(int j=0;j<ps.length;j++){
            System.out.print(ps[j]+" ");
        }

        if(start==0){
                sum = ps[end];
        }else{
            sum = ps[end]-ps[start-1];
        }

        return sum;
    }
    
}