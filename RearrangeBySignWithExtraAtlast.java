/*There’s an array ‘A’ of size ‘N’ with positive and negative elements (not necessarily equal). 
Without altering the relative order of positive and negative elements, 
you must return an array of alternately positive and negative values. 
The leftover elements should be placed at the very end in the same order as in array A. */
import java.util.ArrayList;

public class RearrangeBySignWithExtraAtlast {
    public static void main(String[] args) {
        int arr[] = {1,2,-4,-5,3,4};
        Solution(arr);
        
    }
    public static void Solution(int[] arr){
        ArrayList<Integer> pos_list = new ArrayList<>();
        ArrayList<Integer> neg_list = new ArrayList<>();

        for(int num:arr){
            if(num>0)pos_list.add(num);
            else neg_list.add(num);
        }
        int pos_length = pos_list.size();
        int neg_length = neg_list.size();
        
        if(pos_length>neg_length){

            for(int i=0;i<neg_length;i++){
                arr[i*2] = pos_list.get(i);
                arr[i*2+1] = neg_list.get(i);
            }
            int index = neg_length*2;
            for(int i=neg_length;i<pos_length;i++){
                arr[index] = pos_list.get(i);
                index++;
            }
        }else{
            for(int i=0;i<pos_length;i++){
                arr[i*2] = pos_list.get(i);
                arr[i*2+1] = neg_list.get(i);
            }
            int index = pos_length*2;
            for(int i=pos_length;i<neg_length;i++){
                arr[index] = neg_list.get(i);
                index++;
            }
        }

        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
