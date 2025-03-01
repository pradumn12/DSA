public class Multiply2DMatrix {
    public static void main(String[] args) {
        int[][] A = {{1,2},{3,4}};
        int[][] B = {{5,6},{7,8}};
        int[][] C = new int[A.length][B[0].length];
        if(A[0].length==B.length){
            C = multiplyMatrix(A,B);
        }else{
            System.out.println("Multiplication is not possible");
        }
        for(int i=0;i<A.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
        
    }
    public static int[][] multiplyMatrix(int[][] A,int[][] B){

        int row = A.length;
        int column = B[0].length;
        int Acolumn=A[0].length;
        int[][] C = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                C[i][j]=0;
            }
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                for(int k=0;k<Acolumn;k++){
                    C[i][j]+=A[i][k]*B[k][j];
                }
            }
        }
        return C;
    }
}
