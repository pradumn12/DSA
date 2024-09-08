public class IsSortedArray {
    public static void main(String[] args) {
        int[] arr = {5,4,6,7,8};
        boolean result = Solution(arr);
        System.out.println("Given arr is Sorted? "+result);
    }
    public static boolean Solution(int[] arr){
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){//3>4 4>6 6>8 8>10 10>12
                continue;
            }
            else{
                return false;
            }

        }
        return true;
    }
}
