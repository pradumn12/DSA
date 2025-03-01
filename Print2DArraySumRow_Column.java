public class Print2DArraySumRow_Column {
    public static void main(String[] args) {
        int[][] arr = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int size = arr.length;
        sumByRow(arr,size);
        System.out.println();
        sumByColumn(arr,size);
    }
    public static void sumByRow(int A[][], int size){
        
        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=0;j<size;j++){
                sum+=A[i][j];
            }
            System.out.println("Sum of row "+(i+1)+": "+sum);
        }
    }
    public static void sumByColumn(int A[][], int size){
        
        for(int i=0;i<size;i++){
            int sum=0;
            for(int j=0;j<size;j++){
                sum+=A[j][i];
            }
            System.out.println("Sum of Col "+(i+1)+": "+sum);
        }
    }
}
