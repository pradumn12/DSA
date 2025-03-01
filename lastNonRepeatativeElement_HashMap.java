import java.util.HashMap;
import java.util.Map;

public class lastNonRepeatativeElement_HashMap {
    public static void main(String[] args) {
        int arr[] = {8, 2, 8, 7, 1, 2, 6, 5};
        int n = arr.length;
        int element = lastNonRepeat(arr, n);
        System.out.println("Last non-repetitive element is: " + arr[element]);
  
    }
    public static int lastNonRepeat(int[] arr, int N) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        HashMap<Integer, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (!frequencyMap.containsKey(arr[i])) {
                frequencyMap.put(arr[i], 1);
                indexMap.put(arr[i], i);
            } else {
                frequencyMap.put(arr[i], frequencyMap.get(arr[i]) + 1);
            }
        }
        System.out.println("Frequency HashMap "+frequencyMap);
        System.out.println("Index HashMap "+indexMap);

        int minIndex = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){

            
            if(entry.getValue()==1 && indexMap.get(entry.getKey())> minIndex){
                minIndex = indexMap.get(entry.getKey());
            }
            //try it yourself why not used System.out.println(indexMap.get(entry.getValue()));
            
        }
        
        System.out.println("Minimum Index value: " + minIndex);
        return minIndex; 

    }
    
}
