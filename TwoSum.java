import java.util.Arrays;
import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {3,3};// 2 5 6 8 11 //2,6,5,8,11
        int target = 6; //14
        //Solution_BF(arr,target);// O(N2)
        Solution_HashMap(arr,target);//O(N)
        //Solution_UsingPointers(arr,target);//O(N)+O(N*logN) loop + sorting
    }
    public static void Solution_UsingPointers(int[] arr,int target){
        int n = arr.length;
        Arrays.sort(arr);
        int sum = 0;
        int left = 0;
        int right = n-1;
        while(left<right){
            sum = arr[left]+arr[right];
            if(sum>target){
                right--;
            }else if(sum<target){
                left++;
            }else if(sum==target){
                System.out.println("Yes, values are: "+arr[left]+","+arr[right]);
                break;
            }
        }

    }
    public static void Solution_HashMap(int[] arr,int target){
        /*
         *for input {3,3} target = 6, if(map.containsKey(complement) && map.get(complement)!=i){ workes
         for input {} target =14, if(map.containsKey(complement) && map.get(complement)!=i && arr[i]>compliment){
         to avoid duplicay of 8,6 & 6,8 
         */
        int n = arr.length;
        int[] result = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){

            if(!map.containsKey(arr[i])){
                map.put(arr[i],i);
            }
        }//2,6,5,8,11
        System.out.println(map);
        for(int i=0;i<n;i++){
            int complement = target-arr[i];
            if(map.containsKey(complement) && map.get(complement)!=i){ //arr[i]>complement to avoid duplicates pair
                System.out.println("values are: "+arr[i]+" and "+ complement);
                result[0] = i;
                result[1] = map.get(complement);
                System.out.println("Result "+result[0]+" "+result[1]);
            }
        }
    }

    public static void Solution_BF(int[] arr,int target){
        int n = arr.length;
        int flag = 0;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                int sum = 0;
                sum+=arr[i]+arr[j];
                if(sum==target){
                    System.out.println("index: "+i+" value: "+arr[i]+" index: "+j+" value: "+arr[j]);
                    flag =-1;
                    break;
                }
            }
            if(flag==-1){
                System.out.println("Yes two number exist");
                break;
            }

        }
    }
}
