import java.util.HashSet;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        Solution(arr);
    }

    public static void Solution(int[] arr){

        HashSet<Integer> set = new HashSet<>();
        int n = arr.length;
        for(int i=0;i<n;i++){
            set.add(arr[i]);
        }
        System.out.println(set.size());

        for(int i:set){
            System.out.print(i);
        }
        
    }
}
