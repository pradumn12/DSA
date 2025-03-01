public class AddandSubtract2DMatrix {
    public static void main(String[] args) {
        int[][] A = {{1, 2, 3},{4, 5, 6},{7, 8, 9},{7,7,7}}; 
        System.out.println("Length of Matrix number of rows: "+A.length); 
        System.out.println("Length of Matrix number of column: "+A[0].length); 
        int[][] B = {{9, 8, 7},{6, 5, 4},{3, 2, 1},{9,9,9}};
        addMatrix(A,B);
        subtractMatrix(A,B);//A-B
        
    }
    public static void addMatrix(int[][] A, int[][] B){
        int[][] C = new int[A.length][B.length];
        System.out.println("Adition of Matrix: ");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void subtractMatrix(int[][] A, int[][] B){
        int[][] C = new int[A.length][B.length];
        System.out.println("Subtraction of Matrix: ");
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                C[i][j] = A[i][j] - B[i][j];
                System.out.print(C[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
