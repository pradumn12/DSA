import java.util.HashSet;
import java.util.ArrayList;

public class UnionOfSortedArrays {// TC O(n1+n2) SC O(n1+n2)
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,7};
        int[] arr2 = {2,3,4,4,5,9};
        union(arr1,arr2);
    }
    public static void union(int[] arr1,int[] arr2){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr1.length;i++){
            list.add(arr1[i]);
        }
        for(int i=0;i<arr2.length;i++){
            list.add(arr2[i]);
        }
        HashSet<Integer> set = new HashSet<>();
        for(int value:list){
            set.add(value);
        }
        System.out.println("Union is: "+set);
    }
}
