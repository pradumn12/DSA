public class Google_ArrayEqualToZero_AddValueTillGivenIndex {
    public static void main(String[] args) {
        int arr[] = new int[]{0,0,0,0,0,0};
        int A[] = addValue(arr,2,4,2);
        int B[] = addValue(A, 1, 3, 1);
        int C[] = addValue(B, 0, 2, 3);
        int D[] = addValue(C, 3, 5, 4);
        int E[] = prefixSum(D);
        System.out.println("Optimised Approach ----x----x-----x---");
        for(int i=0;i<E.length;i++){
            System.out.print(E[i]+" ");
        }

    }
    public static int[] addValue(int[] A, int start, int end, int value){

        A[start]+=value;
        if(end<A.length-1){
            A[end+1]+=(-value);
        }

        return A;
    }
    public static int[] prefixSum(int[] B){

        int size = B.length;
        int ps[] = new int[size];
        ps[0] = B[0];
        for(int i=1;i<size;i++){
            ps[i] = ps[i-1] + B[i];
        }
        return ps;
    }

}
