/*Print in order of clockwise */
public class PrintBoundaryElementOfmatrix {
    public static void main(String[] args) {
        int[][] A = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int size = A.length;
        System.out.println("Original Array: ");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(A[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----x-----x----x----");

        System.out.println("Boundary Values: ");
        for(int col=0;col<size;col++){
            System.out.print(A[0][col]+" ");
        }
        System.out.println();
        System.out.println("----x-----x----x----");
        for(int row=1;row<size;row++){
            System.out.print(A[row][size-1]+" ");
        }
        System.out.println();
        System.out.println("----x-----x----x----");
        for(int col=size-2;col>=0;col--){
            System.out.print(A[size-1][col]+" ");
        }
        System.out.println();
        System.out.println("----x-----x----x----");
        for(int row=size-2;row>=1;row--){
            System.out.print(A[row][0]+" ");
        }
    }

}
