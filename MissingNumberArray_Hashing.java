public class MissingNumberArray_Hashing {
    public static void main(String[] args) {
        
        int arr[] = {1,2,4,5};
        missingNumber_usingHashing(arr);   
    }
    public static void missingNumber_usingHashing(int[] arr){
        int n = arr.length;//2
        int[] temp = new int[n+2];// if arr = {4,3,1,5} then temp = {0,1,0,1,1,1}

        for(int i=0;i<n;i++){
            temp[arr[i]]++;
        }
        for(int i=1;i<n+2;i++){
            if(temp[i]==0){
                System.out.println("Missing num: "+i);
            }
        }

    }
}

