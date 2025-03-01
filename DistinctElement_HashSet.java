import java.util.HashSet;

public class DistinctElement_HashSet {
    public static void main(String[] args) {
        int arr[] = {2,4,3,6,2,6,3,2,1,0,100,-2,100};
        int n = arr.length;
        int result = distinctElement(arr,n);
        System.out.println("Number of distinct element are: "+result);
    }
    public static int distinctElement(int[] arr, int len){

        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<len;i++){
                set.add(arr[i]);
        }
        System.out.println("HashSet elements are: "+set);
        
        return set.size();
    }
}
