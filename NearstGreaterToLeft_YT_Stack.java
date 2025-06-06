import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearstGreaterToLeft_YT_Stack {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        Solution(arr);
    }
    public static void Solution(int[] arr){
        Stack<Integer> stk = new Stack<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(stk.empty()){
                list.add(arr[i]);
            }else if(!stk.empty() && stk.peek()>arr[i]){
                list.add(stk.peek());
            }else if(!stk.empty() && stk.peek()<=arr[i]){
                while(!stk.empty() && stk.peek()<=arr[i]){
                    stk.pop();
                }
                if(stk.empty()){
                    list.add(-1);
                }else if(stk.peek() > arr[i]){
                    list.add(arr[i]);
                }
            }
            stk.push(arr[i]);
        }
        System.out.println(list);
        
    }
}
