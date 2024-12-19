import java.util.Arrays;

/*Find the longest break point
 * Swap with the number just greater than one
 * reverse from index+1 till end
 */
public class NextPermutation_Striver{
    public static void main(String[] args) {
        //int[] nums = {2,1,5,4,3,0,0}; // 2 3 0 0 1 4 5
        int[] nums = {5,4,3,2,1,0,0};
        int[] result = nextPermutation(nums);
        System.out.println();
        for(int n:result){
            System.out.print(n+" ");
        }
    }

    public static int[] nextPermutation(int[] nums) {
        //nums[] = {2,1,5,4,3,0,0}
        int index = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]< nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1){// Edge case what if our input array is {5,4,3,2,1,0,0} then index value will remain -1 so next permutation will be the first one that can be get by simply reversing the array
            Arrays.sort(nums);
            return nums;
        }
        for(int i=n-1;i>index;i--){
            if(nums[i]>nums[index]){
                swap(nums,i,index);
                break;
            }
        }
        int[] result = reverse(nums,index+1,n);
        return result;
        
    }
    public static void swap(int[] nums,int a,int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public static int[] reverse(int[] nums,int start,int end){
        Arrays.sort(nums,start,end);
        return nums;
    }
}