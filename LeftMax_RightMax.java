public class LeftMax_RightMax {
    public static void main(String[] args){
        int arr[] = new int[]{-3,6,2,4,7,2,8,-9,3,1};
        int size = arr.length;

        System.out.println("Left Max Array: ");
        int A[] = leftMax(arr,size);
        for(int j=0;j<size;j++){
            System.out.print(A[j]+" ");
        }

        System.out.println();
        System.out.println("Right Max Array: ");
        int B[] = rightMax(arr,size);
        for(int j=0;j<size;j++){
            System.out.print(B[j]+" ");
        }
    }
    public static int[] leftMax(int[] A, int size){

        int leftMax[] = new int[size];
        leftMax[0] = A[0];
        for(int i=1;i<size;i++){
            if(A[i]>leftMax[i-1]){
                leftMax[i] = A[i];
            }else{
                leftMax[i] = leftMax[i-1];
            }
        }
        return leftMax;
    }

    public static int[] rightMax(int[] A, int size){
        int rightMax[] = new int[size];
        rightMax[size-1] = A[size-1];

        for(int i=size-2;i>=0;i--){
            if(A[i]>rightMax[i+1]){
                rightMax[i] = A[i];
            }else{
                rightMax[i] = rightMax[i+1];
            }

        }
        return rightMax;
    }
    
}
