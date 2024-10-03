import java.util.HashMap;

public class LongestSubArrayWithGivenSumK_AllSolution {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,9};//2 5 10 11 19
        int N = 5;
        int sum = 10;
        //Solution_BF(arr,N,sum);// TC O(N3)
        //Solution_Better(arr,N,sum);// TC O(N2)
        //Solution_Optimal(arr,N,sum);// TC O(N)
        Solution_Prefix_PositiveNegative(arr,N,sum);
    }
    public static void Solution_Prefix_PositiveNegative(int[] arr,int N,int sum){
        HashMap<Integer,Integer> prefixMap = new HashMap<>();
        int prefix=0;
        int maxlength = 0;
        for(int i=0;i<N;i++){
            prefix+=arr[i];

            if(prefix==sum){
                maxlength = i+1;
            }
            int rem = prefix-sum;
            if(prefixMap.containsKey(rem)){
                int length = i-prefixMap.get(rem);
                maxlength= Math.max(maxlength,length);
            }

            if(!prefixMap.containsKey(prefix)){
                prefixMap.put(prefix,i);
            }

        }
        System.out.println("Max length:"+maxlength);

    }






    public static void Solution_Optimal(int[] arr,int N,int sum){
        int left =0, right = 0,length=0;
        int add = arr[0];
        while(right<N){
            while(add>sum && left<=right){

                add-=arr[left];
                left++;
            }
            if(sum==add){
                length = Math.max(length,right-left+1);
            }
            right++;
            if(right<N){

                add+=arr[right];
            } 
        }
        System.out.println("Max length is: "+length); 
    }











    public static void Solution_Better(int[] arr,int N,int sum){
        int length = 0;
        for(int i=0;i<N;i++){
            int add = 0;
            for(int j=i;j<N;j++){
                add+=arr[j];

                if(add==sum){
                    //length = j-i+1;
                    //or
                    length = Math.max(length, j-i+1);
                }
                /* 
                if(length>max){
                    max = length;
                    length = 0;
                }*/
            }
            

        }
        System.out.println("Longest subarray with sum: "+sum+" is:"+length);
    }













    public static void Solution_BF(int[] arr,int N, int sum){
        int max = 0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                int add = 0,length = 0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    add+=arr[k];
                }
                if(add==sum){
                    length = j-i+1;
                }
                if(length>max){
                    max = length;
                    length = 0;
                }
                System.out.println();
            }
            
        }
        System.out.println("Max length: "+max);
    }
}
