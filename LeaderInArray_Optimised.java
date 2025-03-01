// Tried the approach with Array in T.C O(N), S.C O(N)

public class LeaderInArray_Optimised {
    public static void main(String[] args) {
        int[] arr = new int[]{16,17,4,3,5,2};
        int N = arr.length;
        int[] finalAns = leader(arr,N);

        for(int k=0;k<finalAns.length;k++){
            System.out.print(finalAns[k]+" ");
        }
    }
    public static int[] leader(int[] A,int N){
        int[] ans = new int[N];
        int count = 0;
        ans[count++] = A[N-1];
        int max = A[N-1];
        for(int i=N-2;i>=0;i--){
            if(A[i]>max){
                max = A[i];
                ans[count++] = max;
            }
        }
        int[] res = new int[count];
        for(int j=0;j<res.length;j++){
            res[j] = ans[j];
        }
        return res;

    }
}
