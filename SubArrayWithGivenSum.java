/*Given an array of positive integers A and an integer B, find and return first continuous subarray which adds to B.

If the answer does not exist return an array with a single integer "-1".

First sub-array means the sub-array for which starting index in minimum. */

public class SubArrayWithGivenSum {
    public static void main(String[] args) {
        //int A[] = {1, 2, 3, 4, 5};
        int A[] = {23,50,44,6,39,15,44,27,47,29,30,44,28,42,7,32,16,
            40,8,7,5,48,48,16,9,5,50,16,18,9,21,26,48,37,27,7,5,29,
            24,28,10,44,21,1,48,15,31,41,42,23,4,32,40,40,27,20,29,42,25,18,37,43,13,30,42,24,17,42,14,42,43,36,31,29,24,24,8,3,12,34,14,6};
        int B = 62;
        int res[] = subArray(A,B);
        //Printing of Sub-array element
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
        }
    }
    public static int[] subArray(int A[], int B){

        //int res[] = new int[2];
        System.out.println("Original Array: ");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        int ps[] = new int[A.length];
        ps[0] = A[0];
        for(int i=1;i<A.length;i++){
            ps[i] = ps[i-1] + A[i];
        }
        System.out.println();
        System.out.println("Prefix-Sum: ");
        for(int i=0;i<A.length;i++){
            System.out.print(ps[i]+" ");
        }
//A[] 1 2 3 4 5  ps[]//1 3 6 10 15
        System.out.println();
        for(int i=0;i<A.length;i++){
            int sum = 0;
            for(int j=i;j<A.length;j++){
                if(i==0){
                    sum = ps[j]; // Don't use sum += ps[j];
                    System.out.println("Sum1: "+sum);
                }else{
                    sum = ps[j] - ps[i-1]; // Don't use sum += ps[j] - ps[i-1];
                    System.out.println("Sum2: "+sum);
                }

                if(sum==B){
                    System.out.println("Starting index: "+i+" ending index: "+j);
                    /*Only if you want to know the minimum starting index */
                    int count = j-i+1;
                    int res[] = new int[count];
                    System.arraycopy(A, i, res, 0, j-i+1);
                    return res;
                    
                    
                }


            }
        }
        int[] no_res = {-1};

        return no_res;

    }
}
/*1 2 3 4 5

Possible sub-array:
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 
 * 2
 * 2 3
 * 2 3 4
 * 2 3 4 5
 * 
 * 3 
 * 3 4
 * 3 4 5
 * 
 * 4
 * 4 5
 * 
 * 5
 * 
 * 
 * 
 * 
 */
