// Num of Majority element present for N/3 is N-1 = 2
public class Majority_Element_NByThree {
    public static void main(String[] args) {
        
        int[] arr = {1,2,2,1,1,1,3,2,2};
        int length = arr.length;

        int element = majorityElement(arr,length);
        System.out.println(">N/3 elements are: "+element);

    }
    public static int majorityElement(int[] arr , int N){

            int me1 = -1;
            int me2 = -1;
            int count1 = 0;
            int count2 = 0;
            
            for(int i=0;i<N;i++){
                int ele = arr[i];
                if(arr[i]==me1){
                    count1++;
                }else if(arr[i]==me2){
                    count2++;
                }else if(count1==0){
                    me1  = ele;
                    count1=1;
                }else if(count2==0){
                    me2 = ele;
                    count2=1;
                }else{
                    count1--;
                    count2--;
                }
            }
            
            int numcount1 = 0;
            int numcount2 = 0;

            for(int i=0;i<N;i++){
                if(arr[i]==me1){
                    numcount1++;
                }
                if(arr[i]==me2){
                    numcount2++;
                }
            }

            if(numcount1>N/3){
                return me1;
            }else if(numcount2>N/3){
                return me2;
            }
            return -1;
    
    }
    
}

