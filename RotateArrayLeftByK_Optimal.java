public class RotateArrayLeftByK_Optimal {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};//6 5 4 3 2 1
        int n = arr.length;
        int k=4;
        //Reverse 0,n
        //Reverse 0 n-k
        //Reverse n-k+1 n-1;
        reverse(arr,0,n-1);
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);//6 2 3 4 5 1
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int[] arr,int start, int end){
        int temp,i,j;
        for(i=start,j=end;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
