public class AntiDiagonals2DMatrix{
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int row = arr.length;
        int col = arr[0].length;
        printAntiDiagonalElement(arr,row,col);
    }
    public static void printAntiDiagonalElement(int[][] A, int row, int col){

        for(int j=0;j<col;j++){
            int i=0;
            while(i<row && j>=0){
                System.out.print(A[i][j]);
                i++;
                j--;
            }
        }


    }
    
}