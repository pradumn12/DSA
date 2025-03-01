/*  No extra space allowed and Numbers of swaps <= k (means we can not use the sorting libraries)
Can we do it in O(n) time? as of now the T.C is O(N2) not fullfilled this criteria : Numbers of swaps <= k
*/
public class KthMinElement {
    public static void main(String[] args) {
        int[] arr = {2,0,5,7,3,8,4,1}; // Assume no duplicates
        int N = arr.length;
        int k  = 3;
        int element = returnKthElelemt(arr,N,k);
        System.out.println("Kth element ("+k+") found is: "+element);
    }
    public static int returnKthElelemt(int[] arr, int N, int k){
        int temp;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                if(arr[i]>arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Sorted the array without using libraries
        for(int i=0;i<N;i++){
            System.out.print(arr[i]+" ");
        }
        return arr[k-1];
    }
}
