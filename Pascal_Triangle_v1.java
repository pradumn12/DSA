public class Pascal_Triangle_v1 {
    public static void main(String[] args) {
        //given row and column, find the element
        element_given_r_c_BrutForce(5,3);
        System.out.println(element_given_r_c_Optimised(5,3));
        
    }
    public static void element_given_r_c_BrutForce(int row, int col){

        //nCr
        int new_row = row-1, new_col = col-1;
        int result = factorial(new_row)/(factorial(new_col)*factorial(new_row-new_col));
        System.out.println("Pascal triangle element at row: "+row+" and column: "+col+" is: "+ result);

    }
    public static int factorial(int n){

        if(n==0){
            return 1;
        }

        return n*factorial(n-1); 
    }

    public static int element_given_r_c_Optimised(int row, int col){

        int result = 1;
        int new_row = row-1, new_col = col-1;
        for(int i=0;i<new_col;i++){
            result*=(new_row-i);
            result/= (i+1);
        }
        return result;
    }
}
