import java.util.HashMap;
import java.util.Map;
//TC O(N)  SC O(N)

public class HighestLowestFreqElement {
    public static void main(String[] args) {
        int[] arr = {10,5,10,15,10,5};
        int n = arr.length;
        Solution(arr,n);
    }
    public static void Solution(int[] arr,int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                int value = map.get(arr[i]);
                map.put(arr[i],value+1);
            }
        }
        System.out.println(map);
        int max_fre = 0, min_fre = n;
        int max_ele = 0, min_ele = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int count =  entry.getValue();
            int element = entry.getKey();

            if(count>max_fre){
                max_ele = element;
                max_fre = count;
            }
            if(count<min_fre){
                min_ele = element;
                min_fre = count;
            }
        }
        System.out.println("Highest freq element: "+max_ele+" with frequency: "+max_fre);

        System.out.println("Lowest freq element: "+min_ele+" with frequency: "+min_fre);
        

    }
}
