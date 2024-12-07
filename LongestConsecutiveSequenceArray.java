import java.util.Arrays;
public class LongestConsecutiveSequenceArray {

    public static void main(String[] args) {
        //int[] arr = {3, 8, 5, 7, 6, 11, 15, 14, 12, 13};
        int[] arr = {100,4,200,1,3,2};// 1 2 3 4 100 200
        
        Solution(arr);
    }
    public static void Solution(int[] arr){

        int n = arr.length;
        Arrays.sort(arr);// 1 2 3 4 100 200  //3, 5, 6, 7, 8, 11, 12, 13, 14, 15
        int start = arr[0];
        int count = 1;
        int max = 0;
        for(int i=1;i<n;i++){//i=3
            if((start+1)==arr[i]){
                count++;//1
            }else{
                count = 1;
            }
                start = arr[i]; 
                max = Math.max(count,max);
        }
        System.out.println(max);
    }
    //0,3,7,2,5,8,4,6,0,1
    // 0 0 1 2 3 4 5 6 7 8
    // 1 2 0 1
    //0 1 1 2
    
}
