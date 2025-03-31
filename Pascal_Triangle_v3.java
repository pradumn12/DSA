import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle_v3 {
    public static void main(String[] args) {
        //Solution_BF(4);
        //Solution_Better(5);// Same as leetcode TC O(N2) optimal
        System.out.println(Solution_Leetcode(5));//TC O(N2) optimal
    
    }
    public static List<List<Integer>> Solution_Leetcode(int element){

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> capture_list = new ArrayList<>();
        
        for(int i=1;i<=element;i++){
            capture_list = collect_values(i);
            result.add(capture_list);
        }
        return result;
        

    }
    public static List<Integer> collect_values(int row){
        List<Integer> list = new ArrayList<>();

        if(row==1){
            list.add(1);
        }else if(row==2){
            list.add(1);
            list.add(1);
        }else{
            int result = 1;
            list.add(1);
            for(int i=0;i<row-2;i++){
                result*=(row-1-i);
                result/=(i+1);
                list.add(result);
            }
            list.add(1);
        }
        return list;

    }






    public static void Solution_Better(int item){

        for(int i=1;i<=item;i++){
            printValues(i);
        }
    }
    public static void printValues(int row){

        if(row==1){
            System.out.println("1");
    
        }else if(row==2){
            System.out.println("1 1");
        }else{
            System.out.print("1 ");
            int result = 1;
            for(int i=0;i<row-2;i++){
                result*=(row-1-i);
                result/=(i+1);
                System.out.print(result+" ");
            }

            System.out.print("1");
            System.out.println();
        }
        
    }





    public static void Solution_BF(int item){

        for(int i=1;i<=item;i++){
            for(int j=1;j<=i;j++){
                System.out.print("[ "+element(i,j)+" ]");
            }
            System.out.println();
        }

    }
    public static int element(int row,int col){
        int result = 1;
        int row_index = row-1;
        int col_index = col-1;
        if(col_index==row_index || col_index==0){
            return 1;
        }else if(col_index==1){
            return row_index;
        }else{
            for(int i=0;i<col_index;i++){
                result*=(row_index-i);
                result/=(i+1);
            }
        }
        return result;

    }
}
