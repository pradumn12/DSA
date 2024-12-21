public class RotateMatrixBy90 {
    //Transpose the array and reverse each row
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        Solution(arr);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Solution(int[][] arr){
        int row= arr.length;
        int col = arr[0].length;

        for(int i=0;i<row;i++){
            for(int j=i+1;j<col;j++){
                transpose(arr,i,j);
            }
        }
        reverse(arr,row,col);

    }
    public static void transpose(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    public static void reverse(int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][col-1-j];
                arr[i][col-1-j] = temp;
            }
        }
    }
}
