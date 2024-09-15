import java.util.HashMap;

public class HashMap_Frequency_Array {
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3};
        int n = arr.length;
        int k = 3;
        Solution(arr,n,k);
    }// HashMap stores in key-sorted format 
    public static void Solution(int[] arr,int n, int k){
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
        

    }
}
