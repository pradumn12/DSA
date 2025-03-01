/*Given an array A of integers and another non negative integer B .

Find if there exists 2 indices i and j such that A[i] - A[j] = B and i != j. */

public class DiffInIndices {
    public static void main(String[] args) {
        /* 
        int A[] = {1,5,3};
        int B = 2;
        

        int A[] = {2,4,3};
        int B = 3;
        */
        int A[] = {1,5,4,1,2};
        int B = 0;
        
        boolean res = diffInIndices(A,B);
        System.out.println("Is there exist any indices: "+res);
    }
    public static boolean diffInIndices(int A[], int B){
        boolean value = false;
        if(A.length>1){

            for(int i=0;i<A.length;i++){
                for(int j=i;j<A.length;j++){
                    if(A[i]>A[j] && i!=j){
                        if(A[i]-A[j] == B){
                            return true;
                            }   
                        }else if(A[j]>A[i] && i!=j){
                        if(A[j]-A[i]== B){
                            return true;
                            }
                        }else if(A[i]==A[j] && i!=j){
                            if(A[i]-A[j]==B){
                                return true;
                            }
                    }
                }
            }
            return value;
        }
        
        return value;
    }
}
