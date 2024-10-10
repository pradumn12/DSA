public class KadaneSolution{
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        //Solution_BF(arr);//O(N3)
        //Solution_Better(arr);//O(N2)
        //Solution_PrefixSum(arr);//TC O(N)  SC O(N)
        Solution_Optimal(arr);// O(N)
    }
    public static void Solution_Optimal(int[] arr){
        int n = arr.length;
        int sum = 0;
        int max = 0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
/* IMP
 * if input arr = {-1}
 * then this order will work
 *          if(sum>max){
                max = sum;//1 4 5 6 
            }
            if(sum<0){
                sum = 0;
            }

            and not this
            if(sum<0){
                sum = 0;
            }
            if(sum>max){
                max = sum;//1 4 5 6 
            }
            
 */


            if(sum>max){
                max = sum;//1 4 5 6 
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println("Max: "+max);
    }
    public static void Solution_PrefixSum(int[] arr){
        int n = arr.length;
        int[] prefixsum = new int[n];
        prefixsum[0] = arr[0];
        for(int i=1;i<n;i++){
            prefixsum[i] = prefixsum[i-1]+arr[i];
        }
        int maxSum = arr[0];
        int minprefixsum = 0;

        for(int i=0;i<n;i++){
            int value = prefixsum[i]-minprefixsum;
            maxSum = Math.max(maxSum,value);//-2 

            minprefixsum = Math.min(minprefixsum,prefixsum[i]);
        }
        System.out.println("Minimum prefix sum "+minprefixsum);
        System.out.println("Max sum: "+maxSum);
    }
    public static void Solution_Better(int[] arr){
        int n = arr.length;
        int max = 0,start=0,end=0;
        
        for(int i=0;i<n;i++){
            int sum = 0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>max){
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("Max: "+max);
        System.out.println("i: "+start+" j: "+end);
        
    }

    public static void Solution_BF(int[] arr){
        int n = arr.length;
        int max = 0,start=0,end=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>max){
                    max = sum;
                    start = i;
                    end = j;
                }
            }
        }
        System.out.println("Max sum of sub-array: "+max);
        System.out.println("Indices of sub-array i: "+start+" j: "+end);


    }
}