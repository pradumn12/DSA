public class ReverseArr {
    public static void main(String[] args) {
        int[] arr = new int[]{3,5,2,8,7};
        int N = arr.length;
        int[] C = reverseArr(arr,N);
        System.out.println("Reverse array is: ");
        for(int m=0;m<N;m++){
            System.out.print(C[m]+" ");
        }
    }
    public static int[] reverseArr(int[] A, int size){
        int B[] = new int[size];
        int temp,i,j;
        for(i=0,j=size-1;i<j;i++,j--){
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
        for(int k=0;k<size;k++){
            B[k] = A[k];
        }

        return B;

    }
}
