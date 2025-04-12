import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearstSmallestToLeft_YT_Stack {
    public static void main(String[] args) {
        int[] arr = {4,5,2,10,8};
        Solution(arr);
    }
    public static void Solution(int[] arr){
        List<Integer> list = new ArrayList<>();
        Stack<Integer> stk = new Stack<>();

        for(int i=0;i<arr.length;i++){
            if(stk.empty()){
                list.add(-1);
            }else if(!stk.empty() && stk.peek()< arr[i]){
                list.add(stk.peek());
            }else if(!stk.empty() && stk.peek()>=arr[i]){
                
                while(!stk.empty() && stk.peek()>=arr[i]){
                    stk.pop();
                }
                if(stk.empty()){
                    list.add(-1);
                }else if(stk.peek() < arr[i]){
                    list.add(stk.peek());
                }
            }
            stk.push(arr[i]);
        }

        System.out.println(list);
    }
}
