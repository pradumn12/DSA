public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int size = arr.length;
        System.out.println("Simply printing the transpose using original array");
        PrintingTransposeFromOriginaArray(arr,size);// Simply printing the transpose using a 2D array
        System.out.println("Swaping the element within the original array to create a transpose array");
        int[][] C = creatingTransposeFromOriginalArray(arr,size);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] creatingTransposeFromOriginalArray(int A[][], int size){
        /*Swaping upper right triangle with lower left triangle */    
        int temp = 0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }
    public static void PrintingTransposeFromOriginaArray(int A[][],int size){
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    System.out.print(A[i][j]+" ");
                }
                System.out.println();
            }
    }
}
