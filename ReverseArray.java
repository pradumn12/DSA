public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};//5 2 3 4 1 //5 4 3 2 1 
        int start = 0;
        int end = arr.length-1;
        int temp,i,j;

        for(i=start,j=end;i<j;i++,j--){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
        for(int m=0;m<=end;m++){
            System.out.print(arr[m]+" ");
        }
    }
}
