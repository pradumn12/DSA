// Given an integer array A of size N and an integer B, you have to print the same array after rotating it B times towards the right.
public class RotateElementByKTimes {
    public static void main(String[] args) {
        
        int[] arr = new int[]{4,5,6,7,8};  //8,7,6,5,4 //7,8,4,5,6
        int N = arr.length;
        int K = 2%N;
        reverse(arr,0,N-1);
        reverse(arr,0,K-1);
        reverse(arr,K,N-1);

        for(int i=0;i<N;i++){
            System.out.println(arr[i]);
        }

    }
    public static void reverse(int[] A, int start, int end){
        int temp,i,j;
        for(i=start, j=end; i<j; i++,j--){  //(Initialization, Comparison, Increment/Decrement)
            temp = A[i];
            A[i] = A[j];
            A[j] = temp;
        }
    }
    
    
}
