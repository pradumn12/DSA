// T.C O(N3)  s.C O(1)

public class MaxSumOfSubArray {
    public static void main(String[] args) {
        
    int[] arr = new int[]{1,2,3,4,-10};
    int N = arr.length;
    MaxSumOfAllSubArray(arr,N);
    
    }
    public static void MaxSumOfAllSubArray(int[] A,int size){

        int max=0;
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    System.out.print(A[k]+" ");
                    sum+=A[k];
                }
                if(sum>max){
                    max = sum;
                }
                System.out.print("Sum of current sub-array: "+sum);
                System.out.println();

            }
            System.out.println();
        }
        System.out.println("Max Sum of possible sub-array is: "+max);
    }
    
}

