/*Find sum of max Sub-array and also print the sub-array T.C O(N) */

public class MaxSubArrayKadane {
    
    public static void main(String[] args) {
        int[] arr = new int[]{-2,-3,4,-1,-2,1,5,-3};
        int N = arr.length;
        int res = MaxSum(arr, N);
        System.out.println();
        System.out.print("Result is: "+res);
    }

    public static int MaxSum(int[] A, int size){
        int max = Integer.MIN_VALUE;
        int sum = 0,start=0;
        int ans_start = -1, ans_end =-1;
        for(int i=0;i<size;i++){
            if(sum==0){
                start = i;
            }    
            sum+=A[i];
                
            
                if(sum>max){
                    max = sum;
                    ans_start = start;
                    ans_end = i;
                }
                if(sum<0){
                    sum = 0;
                }
        }
        System.out.print("[ ");
        for(int k =ans_start;k<=ans_end;k++){
            System.out.print(A[k]+" ");
        }
        System.out.print(" ]");
        return max;
    }

}
