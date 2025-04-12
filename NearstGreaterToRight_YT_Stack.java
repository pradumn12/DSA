import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class NearstGreaterToRight_YT_Stack {
    public static void main(String[] args) {
        int[] arr = {1,3,2,4};
        Solution(arr);
    }
    public static void Solution(int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();
        for(int i=arr.length-1; i>=0; i--){
            if(stk.empty()){
                list.add(-1);
            }else if(!stk.empty() && stk.peek() > arr[i]){
                list.add(stk.peek());
            }else if(!stk.empty() && stk.peek()<=arr[i]){

                while(!stk.empty() && stk.peek()<=arr[i]){
                    stk.pop();
                }
                if(stk.empty()){
                    list.add(-1);
                }else if(stk.peek() > arr[i]){
                    list.add(stk.peek());
                }

            }
            stk.push(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);

    }
}
