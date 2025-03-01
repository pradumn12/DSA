import java.util.Arrays;
//T.C O(nlogn + n + n) ~ O(nlon)  S.C O(1)
public class PairsOfAbsMinDiff_BetterApproach {
    public static void main(String[] args) {
        //int[] arr = {3,2,1,4,6};
        int[] arr = {10,30,14,17,19,20,11};
        //int[] arr = {-1,0,2,4,6};
        int N = arr.length; // how to find the length of array without using length keyword
        Arrays.sort(arr);
        int minAbsolute_diff_btwPairs = findMinValue(arr,N);
        System.out.println("Minimum absolute diff btw the pair: "+minAbsolute_diff_btwPairs);
        returnPair(arr, N, minAbsolute_diff_btwPairs);
    }
    public static int findMinValue(int[] arr, int N){

        int min = Short.MAX_VALUE;
        //1,2,3,4,6  N=5
        for(int i=0;i<N-1;i++){
            int diff = arr[i]-arr[i+1];
            //System.out.println("actual Diff value is: "+diff);
            if(diff<0){
                diff = diff - (2*diff);
            }
            if(diff<min){
                min = diff;
            }
        }
        return min;
    }
    public static void returnPair(int[] arr,int N, int minAbsolute_diff_btwPairs){

        int diff = 0;
        for(int i=0;i<N-1;i++){
            diff = arr[i]-arr[i+1];
            if(diff<0){
                diff = diff - (2*diff);
            }
            if(diff==minAbsolute_diff_btwPairs){
                System.out.println("Pairs are: "+"("+arr[i]+","+arr[i+1]+")");
            }
        }

    }
}
