public class MoveZeroToEnd_BF{
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        Solution(arr);
    }
    public static void Solution(int[] arr){
        int n = arr.length;
        int[] temp = new int[n];
        int count = 0;
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                temp[j] = arr[i];//1,2,3,4,1,0,0,0
                j++;
            }else{
                count++;//3
            }
        }
        for(int i=n-count;i>n;i++){//i=5;i<3
            temp[i] = 0;
        }

        for(int m=0;m<n;m++){
            System.out.print(temp[m]+" ");
        }


    }
}