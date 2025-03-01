public class PrintPossibleSubArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,-10};
        int N = arr.length;
        possibleSubArray(arr,N);
    }
    public static void possibleSubArray(int[] A, int size){
        int i,j,k;
        for(i=0;i<size;i++){

            for(j=i;j<size;j++){

                for(k=i;k<=j;k++){
                    System.out.print(A[k]+" ");
                }
                System.out.println();
            }
            System.out.println();

        }
    }
}
