public class SpiralMatrix {
    public static void main(String[] args){
        int arr[][] = {
            { 1, 2, 3, 4 },
		    { 5, 6, 7, 8 },
		    { 9, 10, 11, 12 },
	        { 13, 14, 15, 16 }
        };
        //Output: 1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10
        

        int arr2[][] = {
            { 1, 2, 3, 4 },
		    { 5, 6, 7, 8 },
		    { 9, 10, 11, 12 },
	        { 13, 14, 15, 16 }
        };
        //int row = arr.length;
        //int col = arr[0].length;
        //Output: 16 12 8 4 3 2 1 5 9 13 14 15 11 7 6 10

        /*00 01 02 03
         *10 11 12 13
          20 21 22 23
          30 31 32 33
         */

        //Solution_BF(arr,row,col);

        int row = arr2.length;
        int col = arr2[0].length;
        
        Solution_OtherSpiral(arr2,row,col);
    }
    public static void Solution_OtherSpiral(int arr2[][],int row, int col){

        int top = 0, right = col-1;
        int bottom = row-1, left = 0;

        while(top<=bottom && left<=right){
             
            if(left<=right){

                for(int i=bottom;i>=top;i--){
                    System.out.print(arr2[i][right]+" ");
                }
                right--;
             }

            if(top<=bottom){

                for(int i=right;i>=left;i--){
                    System.out.print(arr2[top][i]+" ");
                }
                top++;
            }

            for(int i=top;i<=bottom;i++){
                System.out.print(arr2[i][left]+" ");
            }
            left++;
            for(int i=left;i<=right;i++){
                System.out.print(arr2[bottom][i]+" ");
            }
            bottom--;
        }

    }


    public static void Solution_BF(int arr[][],int row,int col){
        
        int top = 0, right = col-1;
        int bottom = row-1, left = 0;

        while(top<=bottom && left<=right){

            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]+" ");
            }
            right--;

        if(top<=bottom){

                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]+" ");
                }
                bottom--;
        }
            
            if(left<=right){

        
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left]+" ");
                }
                left++;
            }
        }
        

    }
}
