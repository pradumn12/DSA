public class Majority_Element_BrutForce {
    
    public static void main(String[] args) {
        
        //  N/2
        int[] arr = {1,2,3,1,1,1};
        //int[] arr = {1,2,3,3,3,1,3};
        //int[] arr = {1,1,1,2,2};
        //int[] arr = {2,1,1};
        //int[] arr = {1,1,2};
        int length = arr.length;

        int element = majorityElement_NBy2(arr,length);
        if(element==0){
            System.out.println("No M.E exist");
        }else{
            System.out.println("M.E exist for N/2 with element value as: "+element);
        }
        System.out.println("------x--------x------x--------");

        // N/3
        int[] arr2 = {1,3,2,3,2,2,3};
        int element2  = majorityElement_NBy3(arr2,length);
        if(element2==0){
            System.out.println("No M.E exist");
        }else{
            System.out.println("M.E exist for N/3 with element value as: "+element2);
        }

    }
    public static int majorityElement_NBy2(int[] arr , int N){

        int ele = 0;
        int count = 0;
        for(int i=0;i<N;i++){
            ele = arr[i];
            for(int j=i;j<N;j++){
                if(ele==arr[j]){
                    count++; //2
                }
            }
            if(count>N/2){
                return ele;
            }
        }
            
        return 0;
    }

    public static int majorityElement_NBy3(int[] arr, int N){
        //{1,2,8,2,2,4}
        int ele = 0;
        int count = 0;
        for(int i=0;i<N;i++){
            ele = arr[i];
            for(int j=i;j<N;j++){
                if(ele==arr[j]){
                    count++;
                }
            }
            if(count>N/3){
                return ele;
            }

        }
        return 0;
    }
    
}

