public class RotateArrayLeftByK_BF {// TC O(k) + O(n-k) +O(k) = O(n+k)   SC O(k)

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k=2;
        Solution(arr,k);
    }
    public static void Solution(int[] arr,int k){
        int n = arr.length;
        int[] temp = new int[k];
        for(int i=0;i<k;i++){
            temp[i] = arr[i];
        }
        for(int j=k;j<arr.length;j++){
            arr[j-k] = arr[j];
        }
        for(int i=n-k;i<n;i++){
            arr[i] = temp[i-(n-k)];
        }
        for(int p=0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }

    }
    
}
