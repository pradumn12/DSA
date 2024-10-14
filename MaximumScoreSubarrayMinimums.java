import java.util.ArrayList;

public class MaximumScoreSubarrayMinimums {
    public static void main(String[] args) {
        int[] arr = {4, 3, 1, 5, 6};
        Solution_BF(arr);
    }
    public static void Solution_BF(int[] arr){
        int n = arr.length;
        int max_sum = 0;
        //Possible sub-array print
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                ArrayList<Integer> list  = new ArrayList<>();
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    list.add(arr[k]);
                }

                int min_ele = list.get(0), max_ele = list.get(0);
                for(int element: list){
                    if(element>max_ele){
                        max_ele = element;
                    }
                    if(element<min_ele){
                        min_ele = element;
                    }
                }
                int sum = min_ele + max_ele;
                if(sum>max_sum){
                    max_sum = sum;
                }
                System.out.println();
            }
            System.out.println();
        }
        //find min & max
        //calculate sum and compare with max
        System.out.println("Max value is: "+max_sum);
    }
}
