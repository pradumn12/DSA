/*T.C O(q+N) S.C O(N) for storing new array Prefix sum */
public class Google_ArrayEqualToZero_AddValueTillLast_Optimised {

    public static void main(String[] args) {
        int arr[] = new int[]{0,0,0,0,0,0,0};
        int A[] = addValueFromIndex(arr,1,3);
        int B[] = addValueFromIndex(A,4,2);
        int C[] = addValueFromIndex(B,2,1);
        int finalArray[] = createPreFixSum(C);
        System.out.println("-----x-----x-----");
        for(int i=0;i<arr.length;i++){
            System.out.print(finalArray[i]+" ");
        }

    }
    public static int[] addValueFromIndex(int[] A,int start,int value){

        A[start]+=value;
        return A;
    }
    public static int[] createPreFixSum(int[] A){
        int size = A.length;
        int ps[] = new int[size];
        ps[0] = A[0];
        for(int i=1;i<size;i++){
            ps[i] = ps[i-1] + A[i];
        }

        return ps;
    }
    
}
