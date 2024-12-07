import java.util.ArrayList;
public class LeaderInArray {
    public static void main(String[] args) {
        int[] arr = {10, 22, 12, 3, 0, 6};
        Solution(arr); 
    }
    public static void Solution(int[] arr){
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[n-1]);
        int max = arr[n-1];
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                list.add(arr[i]);
                max = arr[i];
            }
        }
        
        System.out.println(list);

        int temp = 0;
        int size = list.size();
        for(int i=0;i<list.size();i++){
            temp = list.get(i);
            list.set(size-1,temp);
            size--;
        }
        System.out.println(list);
    }
}
