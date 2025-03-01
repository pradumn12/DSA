import java.util.HashMap;
import java.util.Map;

public class FrequencyHashMap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,3,1,6,5,6};
        int x = arr[2]; //3
        int n = arr.length;
        findFrequency(arr,n,x);
    }
    public static void findFrequency(int[] arr, int n, int x){
        HashMap<Integer,Integer> frequencymap = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!frequencymap.containsKey(arr[i])){
                frequencymap.put(arr[i],1);
            }else{
                frequencymap.put(arr[i],frequencymap.get(arr[i])+1);
            }
        }
        System.out.println(frequencymap);
        
        //traverse through HashMap
        for(Map.Entry<Integer,Integer> kvp : frequencymap.entrySet()){
            System.out.println("Element "+kvp.getKey() +" occur "+kvp.getValue()+" times");
        }

        System.out.println("required Element: "+x+" occures "+frequencymap.get(x)+" times");

    }
}
