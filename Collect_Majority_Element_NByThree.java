import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collect_Majority_Element_NByThree {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        List<Integer> result = Solution(arr);
        System.out.println(result);
    }
    public static List<Integer> Solution(int[] arr){

        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            if(entry.getValue()>arr.length/3){
                list.add(entry.getKey());
            }
        }

        return list;


        
    }
}
