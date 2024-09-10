public class RotateArrayLeft_Better {// TC O(N)  SC O(1)
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};// 2 3 4 5 1
        Solution(arr);
    }
    public static void Solution(int[] arr){
        int n = arr.length;
        int temp = arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1] = temp;
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
    }
}
