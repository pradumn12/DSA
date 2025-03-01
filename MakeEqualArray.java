/*Given an integer array A of size N. In one second, you can increase the value of one element by 1.

Find the minimum time in seconds to make all elements of the array equal. */

public class MakeEqualArray {
    public int solve(int[] A) {
        int max = A[0];
        int diff = 0;
        for(int i=0;i<A.length;i++){
            if(A[i]>max)
            max = A[i];
        }
        for(int j=0;j<A.length;j++){
            if(max-A[j]!=0){
                diff+=max-A[j];
            }
        }
        return diff;
    }
}
