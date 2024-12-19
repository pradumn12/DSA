import java.util.HashSet;
public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {9,1,-3,2,4,8,3,-1,6,-2,-4,7};//9 1 -3 2 4 8 3 -1 6 -2 -4 7
        //int length = Solution(arr);
        Solution_Optimal(arr);
        
        //System.out.println("length: "+length);
    }
    public static void Solution_Optimal(int[] arr){

        int count = 0;
        int max_length = Integer.MIN_VALUE;
        int length = 1;

        HashSet<Integer> set = new HashSet<>();
        for(int value:arr){
            set.add(value);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                count=1;
                int x = i;
                while(set.contains(x+1)){
                    count++;
                    x++;
                }
            }
            max_length = Math.max(max_length,count);
        }
        length = Math.max(length,max_length);
        System.out.println("Length is: "+length);


    }
    public static int Solution(int[] arr){
        //Bubble sort O(N2) or use Arrays.sort(arr) O(nlogn)
        int n = arr.length;
        for(int i=n-1;i>=1;i--){
            for(int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int num:arr)
            System.out.print(num+" ");
        
        int length = 1;
        int max_length = Integer.MIN_VALUE;
        //int start = arr[0];
        //int next = start+1;
        for(int i=1;i<n;i++){
            if(arr[i]==arr[i-1]){
                continue;
            }else if(arr[i]==arr[i-1]+1){
                length++;
                if(length>max_length){
                    max_length = length;
                }
            }else{
                length = 1;
            }
        }

        return Math.max(length,max_length);
    }
}

