public class Rotatematrix90DegreeClockWise {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int size = arr.length;
        System.out.println("Original Array: ");
        print2DArray(arr, size);

        int[][] A = transpose(arr,size);
        System.out.println("Transpose of an Array: ");
        print2DArray(A,size);

        System.out.println("------x-----x-----");
        
        System.out.println("Reversing the row element | Final array after rotation of 90 degree clockwise: ");
        int[][] B = reverseRowElement(A,size);
        print2DArray(B,size);
    }
    public static int[][] transpose(int[][] A, int size){
        int temp =0;
        for(int i=0;i<size;i++){
            for(int j=i+1;j<size;j++){
                temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }
        return A;
    }
    public static int[][] reverseRowElement(int[][] A,int size){
        int temp = 0;
        for(int i=0;i<size;i++){
            for(int j=0;j<size/2;j++){
                temp = A[i][j];
                A[i][j] = A[i][size-1-j];
                A[i][size-1-j] = temp;

            }
           
        }
        return A;
    }
    public static int[][] print2DArray(int[][] A,int size){

        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }

        return A;

    }
}
