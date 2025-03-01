/*Given an array count the number of distinct element */

import java.util.HashMap;

public class DistinctElement_HashMap {
    public static void main(String[] args) {

    int[] arr = {7,3,2,1,3,7,0};// distinct elemt are: 7,3,2,1,0 or you can use a HashSet
    int n = arr.length;
    int result = distinctElement(arr, n);
    System.out.println("Distinct element are: "+result);
        
    }
    public static int distinctElement(int[] arr, int n){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i], 1);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }

        return map.size();
    }
}

