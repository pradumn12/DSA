public class Count0s1s2sInArray {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,2,1,1,2,0,1};
        int N = arr.length;
        count0s1s2s(arr,N);
    }
    public static void count0s1s2s(int[] arr,int N){
        int count0s =0, count1s=0, count2s=0;
        
        for(int i=0;i<N;i++){
            if(arr[i]==0){
                count0s++;
            }else if(arr[i]==1){
                count1s++;
            }
            else if(arr[i]==2){
                count2s++;
            }else{
                System.out.println("Neither 0,1 or 2 is present");
            }
        }
        System.out.println("Count of 0: "+count0s+", Count of 1: "+count1s+", Count of 2: "+count2s);

    }
}
