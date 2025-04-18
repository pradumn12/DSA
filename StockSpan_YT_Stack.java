import java.util.Stack;
import java.util.ArrayList;

public class StockSpan_YT_Stack {
    public static void main(String[] args) {
        int[] arr = {100,80,60,70,60,75,85};
        Solution(arr);
    
    }
    public static void Solution(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(stk.empty()){
                list.add(1);
            }else if(!stk.empty() && stk.peek() < arr[i]){
                list.add(1);
            }else if(!stk.empty() && stk.peek() >= arr[i]){
                int count = 0;
                while(!stk.empty() && stk.peek() >= arr[i]){
                    stk.pop();
                    count++;
                }
                if(stk.empty() || stk.peek() > arr[i]){
                    list.add(count);
                }
            }
            stk.push(arr[i]);
        }
        System.out.println(list);
    }
    
}
