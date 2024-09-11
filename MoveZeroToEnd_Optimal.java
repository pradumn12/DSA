public class MoveZeroToEnd_Optimal {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};//1 
        position(arr);
    }
    public static void position(int[] arr){
        int n = arr.length;
        int temp;
        int j=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }

        }

        for(int m=0;m<n;m++){
            System.out.print(arr[m]+" ");
        }
        
        
    }
}
