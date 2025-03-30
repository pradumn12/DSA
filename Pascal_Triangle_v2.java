import java.util.List;
import java.util.Arrays;
public class Pascal_Triangle_v2 {
    public static void main(String[] args) {
        System.out.println(Solution(3));
        System.out.println(Solution(4));
        System.out.println(Solution(5));
        
    }
    public static List<Integer> Solution(int row){

        //int col = row;
        // 3C0, 3C1, 3C2
        Integer[] arr = new Integer[row];
        for(int i=0;i<row;i++){

            int result = element_row_col(row-1,i);
            arr[i] = result;

        }
        return Arrays.asList(arr);
        
    }
    public static int element_row_col(int row, int col){

        long result = 1;
        if(col==0 || col==row){
            return 1;
        }else{
                
            for(int i=0;i<col;i++){
                result*=(row-i);
                result/=(i+1);
            }
        }
        return (int) result;
    }
}
