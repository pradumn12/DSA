import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatativeElement_HashMapOptimised {

    public static void main(String[] args) {
        int arr[] = {8, 2, 8, 7, 1, 2, 6, 5};
        int n = arr.length;
        int element = firstNonRepeat(arr, n);
        System.out.println("First non-repetitive element is: " + arr[element]);
  
    }
    public static int firstNonRepeat(int[] arr, int N) {
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

        int minIndex = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()){

            
            if(entry.getValue()==1 && indexMap.get(entry.getKey())< minIndex){
                minIndex = indexMap.get(entry.getKey());
            }
            //try it yourself why not used System.out.println(indexMap.get(entry.getValue()));
            
        }
        
        System.out.println("Minimum Index value: " + minIndex);
        return minIndex; 

    }
    
}

/*The line of code indexMap.get(entry.getKey()) < minIndex is used instead of indexMap.get(entry.getValue()) < minIndex for the following reasons:
Explanation:
Key vs. Value:
In a Map.Entry<Integer, Integer>, entry.getKey() refers to the key (element) of the entry, while entry.getValue() refers to the value (frequency) of the entry.
In this context, we are interested in comparing the index of the element (key) stored in indexMap with the current minIndex, not the frequency (value) of the element.
Index Retrieval:
The indexMap is specifically designed to store the index of each element in the input array.
By using entry.getKey(), we retrieve the element (key) from the frequencyMap and then access its corresponding index from the indexMap.
Comparing Indices:
The comparison indexMap.get(entry.getKey()) < minIndex ensures that we are comparing the index of the current element with the minIndex to track the minimum index of the non-repeating element accurately.
Comparing the frequency (value) of the element (entry.getValue()) with minIndex would not serve the purpose of finding the minimum index correctly.
Therefore, indexMap.get(entry.getKey()) is used to retrieve the index of the element (key) from the indexMap for comparison with minIndex to determine the minimum index of the non-repeating element accurately. */
