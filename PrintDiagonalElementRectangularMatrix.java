/*T.C O(N*M) */
public class PrintDiagonalElementRectangularMatrix {
    public static void main(String[] args) {
        int arr[][] = new int[][]{{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24}};
        int rows = arr.length;
        int column = arr[0].length;
        int size = arr.length;
        for(int i=0;i<column;i++){
            printDiagonalOfRectangularMatrix(0,i,arr,size);
        }
        for(int j=1;j<rows;j++){
            printDiagonalOfRectangularMatrix(j,column-1,arr,size);
        }
        
    }
    public static void printDiagonalOfRectangularMatrix(int row,int column, int[][] A,int size){
        int i = row;
        int j = column;
        // To print diagonal element using only row & colum
        while(i<size && j>=0){
            System.out.print(A[i][j]+" ");
            i++;
            j--;
        }
        System.out.println();
    }

}
