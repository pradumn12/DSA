import java.util.Arrays;

public class Sort_0_1_2{
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        //Solution_BF(arr); O(nlogn)
        //Solution_Better(arr);//O(N) with multiple for loop
        Solution_Optimal(arr);// Dutch National Flag Algorithm O(N)
        
    }
    public static void Solution_BF(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Solution_Better(int[] arr){
        int count_0=0,count_1=0,count_2=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count_0++;
            if(arr[i]==1) count_1++;
            if(arr[i]==2) count_2++;
        }

        for(int i=0;i<count_0;i++){
            arr[i] = 0;
        }
        for(int i=count_0;i<count_0+count_1;i++){
            arr[i] = 1;
        }
        for(int i=count_0+count_1;i<count_0+count_1+count_2;i++){
            arr[i] = 2;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //0 low-1 will have sorted 0's
    //low to mid-1 will have sorted 1's
    //mid to high will have unsorted 0,1,2
    //high+1 to n-1 will have sorted 2's
    public static void Solution_Optimal(int[] arr){
        int n = arr.length;
        int low = 0, mid=0, high = n-1;
            while(mid<=high){
                if(arr[mid]==0){
                    swap(arr,low,mid);
                    low++;
                    mid++;
                    }
                else if(arr[mid]==1){
                    mid++;
                    }
                else if(arr[mid]==2){
                    swap(arr,mid,high);
                    high--;
                    }
            }
        
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 
    }
    public static void swap(int[] arr,int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}