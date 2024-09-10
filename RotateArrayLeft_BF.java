public class RotateArrayLeft_BF {// Used a new array TC O(N)  SC O(N)
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};// 2 3 4 5 1
        Solution(arr);
    }
    public static void Solution(int[] arr){
        int n = arr.length;
        int[] new_arr = new int[n];
        new_arr[n-1] = arr[0];
    
        for(int i=1,j=0;i<n;i++,j++){
            
            new_arr[j] = arr[i];
            
        }

        for(int i=0;i<n;i++){
            System.out.print(new_arr[i]+" ");

        }

    }
}
