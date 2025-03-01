/*Understand the solution its not correct */


public class MaxSumOfArray {

    public static int MaxSum(int[] A, int size){
        int sum = 0;
        int max = 0;

        
        for(int i=0;i<size;i++){
            sum = (A[i] > sum+A[i])? A[i]: sum+A[i];
            if(sum>max){
                max = sum;
            }
        }
        
        
        return max;
    }

public static void main(String[] args) {
    
    int[] arr = new int[]{-1,8,-2,5};
    int N = arr.length;
    int res = MaxSum(arr,N);
    System.out.println("Max sum of sub-array is: "+res);
    }

}



