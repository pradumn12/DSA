import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Leetcode_3Sum {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        //Solution_BF(arr);//O(n3)
        //System.out.println("----x----");
        //Solution_Better(arr);//O(n2)
        Solution_Optimised(arr);
    }
    public static void Solution_BF(int[] arr){

        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int sum = 0;
                
                for(int k = j+1;k<arr.length;k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum==0){
                        List<Integer> list = Arrays.asList(arr[i],arr[j],arr[k]);
                        list.sort(null);
                        set.add(list);
                        System.out.println("i,j,k indices are: "+i+" "+j+" "+k);
                    }
                }
                
            }
        }
        System.out.println(set);
    }

    public static void Solution_Better(int[] arr){

        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            HashSet<Integer> store = new HashSet<>();
            for(int j=i+1;j<arr.length;j++){
                int value = -(arr[i]+arr[j]);
                if(store.contains(value)){
                    List<Integer> list = Arrays.asList(arr[i],arr[j],value);
                    list.sort(null);
                    set.add(list);
                }else{
                    store.add(arr[j]);
                }
            }
        }
        System.out.println(set);
    }
    public static void Solution_Optimised(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i!=0 && arr[i]==arr[i-1]) continue;
            
            int j=i+1;
            int k = arr.length-1;
            while(j<k){

            int sum = arr[i]+arr[j]+arr[k];

            if(sum==0){
                List<Integer> temp = Arrays.asList(arr[i],arr[j],arr[k]);
                ans.add(temp);
                j++;
                k--;
                while(j<k && arr[j]==arr[j-1]) j++;
                while(j<k && arr[k]==arr[k+1]) k--;
                
            }else if(sum>0){
                k--;
            }else if(sum<0){
                j++;
            }
            }
        }

        System.out.print("Answer is: "+ans);
    }
    
}
