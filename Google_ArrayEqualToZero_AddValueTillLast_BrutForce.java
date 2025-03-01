/*Array of size N: All elements are equal to zero. Add value to all element from given index to last index */

public class Google_ArrayEqualToZero_AddValueTillLast_BrutForce {
    public static void main(String[] args) {
        int[] arr = new int[]{0,0,0,0,0,0,0};
    
        //result should be 0,3,3,3,3,3,3
        int[] A = addValueFromIndex(arr,1,3);
        for(int i=0;i<arr.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        System.out.println("---------x---------x-------x");
        
        int[] B = addValueFromIndex(A,4,2);
        for(int i=0;i<arr.length;i++){
            System.out.print(B[i]+" ");
        }
        System.out.println();
        System.out.println("---------x---------x-------x");

        int[] C = addValueFromIndex(B,2,1);
        for(int i=0;i<arr.length;i++){
            System.out.print(C[i]+" ");
        }
        System.out.println();
        System.out.println("---------x---------x-------x");

    }
    public static int[] addValueFromIndex(int[] A,int start_index, int value){
        int size = A.length;
        for(int i=start_index;i<size;i++){
            A[i]+=value;
        }
        return A;
    }
    
}
