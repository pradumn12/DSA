import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;

//TC n!*n   SC only auxillary space used by regression: O(n) [less Splace complexity compared to Approach 1]
public class NextPermutation_Approach2 {
    
    public static void main(String[] args){
        int arr[] = {2,2,1,1};
        Arrays.sort(arr);
        List<List<Integer>> result = Solution(arr);
        for(List<Integer> value : result){
            System.out.println(value);
        }

    }
    public static List<List<Integer>> Solution(int[] arr){
        List<List<Integer>> ans = new ArrayList<>();
        recursion(arr,0,arr.length-1,ans);
        return ans;
    }
    public static void recursion(int[] arr,int left,int right,List<List<Integer>> ans){
        if(left==right){//If single element is present
            List<Integer> ds = new ArrayList<>();
            for(int num:arr){
                ds.add(num);
            }
            ans.add(ds);
        }
        else{
            Set<Integer> set = new HashSet<>();
            for(int i=left;i<=right;i++){

                /*Not working for input [2,2,1,1]
                 * Expected output : [[1,1,2,2],[1,2,1,2],[1,2,2,1],[1,2,2,1],[1,2,1,2],[2,1,1,2],[2,1,2,1],[2,2,1,1],[2,1,2,1],[2,1,1,2],[2,2,1,1]]
                 * Actual: [[1,1,2,2],[1,2,1,2],[1,2,2,1],[2,1,1,2],[2,1,2,1],[2,2,1,1]]
                 
                if(i!=left && arr[i]==arr[left]){//Imp
                    continue;
                }*/
                if(set.contains(arr[i])){
                    continue;
                }
                set.add(arr[i]);
                swap(arr, left,i);
                recursion(arr, left+1, right,ans);
                swap(arr, left,i);
            }
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
