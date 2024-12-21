public class SetmatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},
                       {3,4,5,2},
                       {1,3,1,5}};

        int row = arr.length;             
        int col = arr[0].length; 
        //int result[][] = Solution_BF(arr,row,col);  
        int result[][] = Solution_Better(arr,row,col);
         
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(result[i][j]);
            }
            System.out.println();
        }  
               
    }
    public static int[][] Solution_Better(int[][] arr,int row,int col){
        int row_array[] = new int[row];
        int col_array[] = new int[col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    row_array[i] = 1;
                    col_array[j] = 1;
                }
            }
        }
        
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(row_array[i]==1 || col_array[j]==1){
                    arr[i][j] = 0;
                }
            }
        }
        return arr;

    }


    public static int[][] Solution_BF(int[][] arr,int row,int col){

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]==0){
                    modifyRow(arr,row,col,i);
                    modifyCol(arr,row,col,j);
                }
            }
        }
        modify_matrix(arr,row,col);
        return arr;

    }
    
    public static void modifyRow(int[][] arr,int row,int col,int n){
        for(int i=0;i<col;i++){
            if(arr[n][i]!=0){
                arr[n][i] = -1;
            }
        }

    }
    public static void modifyCol(int[][] arr,int row,int col,int m){
        for(int i=0;i<row;i++){
            if(arr[i][m]!=0){
                arr[i][m] = -1;
            }
        }
    }
    public static void modify_matrix(int[][] arr,int row,int col){
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(arr[i][j]== -1){
                    arr[i][j] = 0;
                }
            }
        }
    }

        
    
}
