public class Subarray_with_Least_Average {

    public static void main(String[] args) {
        int[] arr = new int[]{3,7,90,20,10,50,40};
        int subArraySize = 3;
        int N = arr.length;
        leastAvg(arr, subArraySize,N);
    }
    public static void leastAvg(int[] A, int B, int size){
            int sum = 0,start=0,avg=0;
            int min = Integer.MAX_VALUE;
        for(int i=0;i<=size-3;i++){
            sum = 0;
            for(int j=i;j<i+3;j++){
                System.out.print(A[j]+" ");
                sum+=A[j];
            }
            avg=sum/B;
            System.out.println();
            System.out.println("Sum of subarray is: "+sum);
            System.out.println("Avg of subarray is: "+avg);
            if(avg<min){
                min = avg;
                start = i;
            }
            System.out.println("----x-----x----x-----");
        }
        System.out.println("Sub-array with least avg of length 3 is: "+min+" with starting index as : "+start+" and ending index as: "+(start+3));

        System.out.print("[ ");
        for(int k=start;k<start+3;k++){
            System.out.print(A[k]+" ");
        }
        System.out.print(" ]");


    }
    
}
