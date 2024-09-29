public class MissingNumberArrya_BF {// Works only for sorted array
    public static void main(String[] args) {
        int arr[] = {1,2,4,5};
        missingNumber_sortedarr(arr);

        missingNumber_unsortedarr(arr);
    }
    public static void missingNumber_sortedarr(int[] arr){// Sorted array given T.C O(N)
        int n = arr.length;
        int j = 1;
        for(int i=0;i<n;i++){
            if(arr[i]==j){
                j++;
            }else{
            System.out.println("Missing num: "+j);
            break;
            }
        }
    }
    public static void missingNumber_unsortedarr(int[] arr){// {4,2,5,1} // TC O(N2)
        int n = arr.length;
        int i;
        for(i=1;i<n;i++){
           int flag = 0;

            for(int j=0;j<n;j++){

                if(arr[j]==i){
                    flag = -1;
                }
            }
            if(flag == 0){
                System.out.println("Missing number: "+i);
            }
            

        }
        
    }
}
