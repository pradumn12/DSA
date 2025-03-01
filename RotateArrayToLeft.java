public class RotateArrayToLeft {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int N = arr.length;
        int B = 2;
        B = B%N;
        int rotatevalue = N-B;
        rotateLeft(arr,0,N-1);
        rotateLeft(arr,0,rotatevalue-1);
        rotateLeft(arr,rotatevalue,N-1);

        for(int k=0;k<N;k++){
            System.out.print(arr[k]+" ");
        }
        
    }
    public static void rotateLeft(int[] A, int start,int end){

        int temp,i,j;
        for(i=start,j=end;i<j;i++,j--){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }

    }
}
