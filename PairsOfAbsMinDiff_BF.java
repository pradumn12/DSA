//T.C O(N2) S.C O(1)

public class PairsOfAbsMinDiff_BF {
    public static void main(String[] args) {
        int[] arr = {3,2,1,4,6};
        int N = arr.length; // how to find the length of array without using length keyword
        int minAbsolute_diff_btwPairs = findMinValue(arr,N);
        System.out.println("Minimum absolute diff btw the pair: "+minAbsolute_diff_btwPairs);
        returnPair(arr, N, minAbsolute_diff_btwPairs);
    }
    public static int findMinValue(int[] arr, int N){
        int diff = Integer.MAX_VALUE;
        for(int i=0;i<=N-1;i++){
            for(int j=i+1;j<N;j++){
                int current_diff = arr[j]-arr[i];
                if(current_diff<0){
                    current_diff = current_diff + (-2*current_diff);
                }
                if(current_diff<diff){
                    diff = current_diff;
                }
            }
        }
        
        return diff;
    }
    public static void returnPair(int[] arr, int N, int diff){

        int pair_diff = 0;
        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                pair_diff = arr[j]-arr[i];
                if(pair_diff<0){
                    pair_diff = pair_diff + (-2*pair_diff);
                }
                if(pair_diff==diff){
                    System.out.println("Pairs are: "+arr[i]+","+" "+arr[j]);
                }
            }

        }

    }
}
