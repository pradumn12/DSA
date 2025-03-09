import java.util.HashMap;
import java.util.Map;

public class MaxSpan {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 1, 4, 1,4};
        //int result = maxSpan(arr);
        int result = maxSpan_Optimise(arr);
        System.out.println("Max span is: "+result);
    }
    public static int maxSpan_Optimise(int[] arr){

        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.get(arr[i])[1] = i;
            }else{
                map.put(arr[i], new int[]{i,i});
            }
        }

        int final_max = 0;
        for(Map.Entry<Integer,int[]> entry : map.entrySet()){
            int[] index = entry.getValue();
            int span = index[1] - index[0];
            if(span>final_max){
                final_max = span;
            }
        }
        return final_max;
    }
    
    public static int maxSpan(int[] arr){
        
        int diff = Integer.MIN_VALUE;
        //int left = 0, right = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    int curr_diff = j-i;
                    if(curr_diff>diff){
                        diff = curr_diff;
                    }
                }
            }
        }
        
        
        return diff;
    }
}
