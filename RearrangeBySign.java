import java.util.ArrayList;


public class RearrangeBySign {
    public static void main(String[] args) {
        //3,1,-2,-5,2,-4
        //3 -2 1 -5 2 -4
        //-1 1
        //1,2,-4,-5,3,4
        int[] arr = {3,1,-2,-5,2,-4};
        //Solution_BF(arr);
        Solution_Optimal(arr);

    }
    public static void Solution_Optimal(int[] arr){
        int n = arr.length;
        int new_arr[] = new int[n];
        int pos_index = 0, neg_index = 1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                new_arr[pos_index] = arr[i];
                pos_index+=2;
            }else{
                new_arr[neg_index] = arr[i];
                neg_index+=2;
            }
        }
        for(int num: new_arr){
            System.out.print(num+" ");
        }
        
    }
    public static void Solution_BF(int[] arr){
        int n = arr.length;
    
        ArrayList<Integer> pos_list = new ArrayList<Integer>();
        ArrayList<Integer> neg_list = new ArrayList<Integer>();

        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos_list.add(arr[i]);
            }else{
                neg_list.add(arr[i]);
            }
        
        }
        System.out.println(pos_list);
        System.out.println(neg_list);

        
        ArrayList<Integer> list = new ArrayList<Integer>();//3 -2 1 -5 2 -4
        
        int x = 0;
        for(int i=0;i<n/2;i++){

            list.add(pos_list.get(x));
            list.add(neg_list.get(x));
            x++;
        }
        System.out.println(list);
        
        //OR

        int y = 0;
        for(int i=0;i<n/2;i++){
            arr[i*2] = pos_list.get(y);
            arr[i*2+1] = neg_list.get(y);
            
            y++;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}
