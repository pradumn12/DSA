import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class NearstSmallestToRight_YT_Stack {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        Solution(arr);
    }
    public static void Solution(int[] arr){

        List<Integer> list = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        for(int i=arr.length-1;i>=0;i--){
            if(stk.empty()){
                list.add(-1);
            }else if(!stk.empty() && arr[i] > stk.peek()){
                list.add(stk.peek());
            }else if(!stk.empty() && arr[i] <= stk.peek()){

                while(!stk.empty() && arr[i] <= stk.peek()){
                    stk.pop();
                }
                if(stk.empty()){
                    list.add(-1);
                }else if(arr[i] > stk.peek()){
                    list.add(stk.peek());
                }
            }
            stk.push(arr[i]);
        }
        Collections.reverse(list);
        System.out.println(list);


    }
}
