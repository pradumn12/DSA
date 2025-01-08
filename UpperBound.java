public class UpperBound {
    public static void main(String[] args) {

    int[] arr = {3,5,8,9,15,19};
        int x = 9;
        int n = arr.length;
        int result = UpperBound_Method(arr, n, x);
        System.out.println(result);
    }
    public static int UpperBound_Method(int[] arr,int n, int x){
        int ans = n;
        int low = 0, high = n-1;

        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]>x){
                ans = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return ans;

    }
}
