/*Given an array A and an integer B. A pair(i, j) in the array is a good pair if i != j and (A[i] + A[j] == B). Check if any good pair exist or not.
 
*/
public class GoodPair {
    public int solve(int[] A, int B) {
        int size = A.length;
        int value = 0;
        for(int i=0;i<size;i++){

            for(int j=0;j<size;j++){

                if(A[i]+A[j]==B && i!=j){
                 value = 1;   
                    
                }
            }
        }
        return value;
    }
}

