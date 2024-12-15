import java.util.List;
import java.util.ArrayList;

//TC n!*n   SC: O(n) data structure + O(n) Map array

public class NextPermutation_Approach1 {

    public static void main(String[] args){
        int arr[] = {1,1,2};
        List<List<Integer>> result = Solution(arr);
        for(List<Integer> value:result){
            System.out.println(value);
        }
        //{1,3,2}:   {1,2,3} {1,3,2} {2,1,3} {2,3,1} {3,1,2} {3,2,1}
    }
    public static List<List<Integer>> Solution(int[] arr){
        List<List<Integer>> ans  = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[arr.length];
        recursion(arr,ds,ans,freq);
        return ans;
    }
    private static void recursion(int[] arr,List<Integer> ds,List<List<Integer>> ans,boolean freq[]){

        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                recursion(arr, ds, ans, freq);
                ds.remove(ds.size()-1);
                freq[i] = false;
            }
        }
    } 
}
