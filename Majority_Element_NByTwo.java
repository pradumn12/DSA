public class Majority_Element_NByTwo {
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,1,1,1};
        //int[] arr = {1,1,1,2,2};
        //int[] arr = {2,1,1};
        //int[] arr = {1,1,2};
        int length = arr.length;

        int element = majorityElement(arr,length);
        int count = iterateArray(element,arr);
        if(count>arr.length/2){
            System.out.println("M.E exist for N/2 with element value as: "+element+" and frequency of: "+count);
        }else{
            System.out.println("No M.E exist");
        }

    }
    public static int majorityElement(int[] arr , int N){
            //1,2,3,1,1,7
            int me = arr[0];
            int count = 0;
            for(int i=0;i<N;i++){
                if(arr[i]==me){
                    count++;
                }else if(count==1){
                    me = arr[i];
                }else{
                    count--;
                }
            }
            System.out.println("M.E: "+me);

        return me;
    }
    public static int iterateArray(int a, int[] arr){

        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                count++;
            }
        }

        return count;

    }
    
}
