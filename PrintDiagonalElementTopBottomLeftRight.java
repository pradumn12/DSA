/*For a square Matrix */
public class PrintDiagonalElementTopBottomLeftRight {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int size = arr.length;
        printDiagonalElementLeftToRight(arr,size);
        System.out.println();
        printDiagonalElementRightToLeft(arr,size);
    }
    public static void printDiagonalElementLeftToRight(int A[][],int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){
                    System.out.print(A[i][j]+" ");
                }
            }
        }

    }
    public static void printDiagonalElementRightToLeft(int A[][],int size){
        for(int i=0;i<size;i++){
            for(int j=size-1;j>=0;j--){
                if(i+j==size-1){
                    System.out.print(A[i][j]+" ");
                }
            }
        }
    }
}
