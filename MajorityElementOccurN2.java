import java.util.HashMap;
import java.util.Map;

public class MajorityElementOccurN2{
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        //Solution_HashMap(arr);
        Solution_MooreVotingAlgo(arr);
    }
    public static void Solution_HashMap(int[] arr){
        int n = arr.length;
        int count  = n/2;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        System.out.println(map);

        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            Integer value = entry.getValue();
            System.out.println("Value: "+value);
            if(value>count){
                System.out.println(entry.getKey());
            }

        }
    }
    public static void Solution_MooreVotingAlgo(int[] arr){
        int element=arr[0];//2,2,1,1,1,2,2
        int count = 0;

        for(int i=0;i<arr.length;i++){
            if(count==0){
                element = arr[i];
                count=1;
            }else if(arr[i]==element){
                count++;
            }else{
                count--;
            }
        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==element){
                count1++;
            }
        }
        if(count1>arr.length/2){
            System.out.println(element);
        }
    }
}