public class Print2DMatrixRowByRow_Column {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int size = arr.length;
        print2DArrRowWise(arr,size);
        System.out.println();
        print2DArrColWise(arr,size);
    }
    public static void print2DArrRowWise(int A[][],int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(A[i][j]+" ");
            }
        }
    }
    public static void print2DArrColWise(int B[][],int size){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(B[j][i]+" ");
            }
        }
    }
}
