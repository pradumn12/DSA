/* {2,2,1,-3,4,3,1,-2,-3}   2,1,-3 when added result to zero & -3,4,3,1,-2,-3 when added results to zero */

//T.C O(N3)
public class SubArraywithZeroSum_BF {
    public static void main(String[] args) {
        int arr[] = {2,2,1,-3,4,3,1,-2,-3};
        int len = arr.length;
        subArray(arr,len);
    }
    public static void subArray(int arr[], int N){

        for(int i=0;i<N;i++){
            for(int j=i;j<N;j++){
                int sum = 0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum==0){
                    System.out.println("First index is: "+i+" end index is: "+j);
                    for(int l=i;l<=j;l++){
                        System.out.print(arr[l]+" ");
                        
                    }
                    System.out.println();
                    System.out.println("---x----x----x");
                }
                
            }
        }


    }
}
