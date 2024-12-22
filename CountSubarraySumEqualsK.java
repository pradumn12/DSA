import java.util.HashMap;

public class CountSubarraySumEqualsK {
    public static void main(String[] args) {
        //int[] arr = {3,1,2,4};
        int[] arr = {-1,-1,1};
        int k = 0;
        //Solution_BF(arr,k);
        //Solution_Better(arr,k);
        //Solution_Optimal_SlidingWindow(arr,k);// need to modify for input {1} & {-1,-1,1} and k=0
        Solution_Optimal(arr,k);
    }
    public static void Solution_Optimal(int[] arr,int k){
        int n = arr.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        int pre= 0,count =0;
        for(int i=0;i<n;i++){
            pre+=arr[i];
            int remove = pre-k;

            count+=map.getOrDefault(remove,0);
            map.put(pre,map.getOrDefault(pre,0)+1);
        }
        System.out.println("Count is: "+count);
    }
    
    public static void Solution_Optimal_SlidingWindow(int[] arr,int sum){

        int n = arr.length;
        int left = 0,right = 0, count=0, add =arr[0];
        while(right<n){
            while(add>sum && left<=right){
                add-=arr[left];
                left++;
            }
            if(add==sum){
                count++;
            }
            right++;
            if(right<n){
                add+=arr[right];
            }
        }

        System.out.println("No. of sub array whose sum is: "+sum+" is: "+count);

    }

    public static void Solution_Better(int[] arr,int s){
        
        int count = 0;
        for(int i=0;i<arr.length;i++){
            int sum = 0;
            for(int j=i;j<arr.length;j++){// 3 1 2 4
                sum+=arr[j];
                if(sum==s){
                    count++;
                }
            }
        }
        System.out.println("No. of sub array whose sum is: "+s+" is: "+count);
    }
    
    public static void Solution_BF(int[] arr,int s){

        int n = arr.length;
        //int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            int sum =0;
            for(int j=0;j<n;j++){
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    if(sum==k){
                        count++;
                    }
                }
                
            }
            
        }
        System.out.println("No. of sub array whose sum is: "+s+" is: "+count);

    }
}
