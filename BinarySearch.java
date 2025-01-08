public class BinarySearch {

    //TC O(log n)
    public static void main(String[] args) {
        
        int[] arr = {-1,0,3,5,9,12};
        int target = 9;
        int result = search(arr,target);    
        System.out.println(result);
    }
 

public static int search(int[] nums, int target) {
        
    int n = nums.length;
    int low = 0, high = n-1;
    return BinarySearchMethod(nums,low,high,target);
    
    
}
public static int BinarySearchMethod(int[] nums,int low,int high,int target){

    int mid = (low+high)/2;
    if(low>high){
        return -1;
    }

    if(target==nums[mid]){
        return mid;
    }else if(target>nums[mid]){
        return BinarySearchMethod(nums,mid+1,high,target);
    }else{
        return BinarySearchMethod(nums,low,high-1,target);
    }
    
    }
}
