/*T.C O(N*2) */
public class SmallestSubArrayContainingBothMaxMinValue_BrutForce {
    public static void main(String[] args) {
        int[] arr = new int[]{1,6,4,2,7,7,5,1,3,1,1,5};
        int size = arr.length;
        int max_min[] = Max_Min(arr,size);
        System.out.println("Max value is: "+max_min[0]+" Min value is: "+max_min[1]);
        int length = findsmallestSubArraywithMin_Max(arr,size,max_min[0],max_min[1]);
        System.out.println("Smallest length of sub-array having both Min and Max value is: "+length);

    }
    public static int[] Max_Min(int[] A, int size){
        int max = A[0];
        int min = A[0];
        for(int i=0;i<size;i++){
                if(A[i]>max){
                    max = A[i]; 
                }
                if(A[i]<min){
                    min = A[i];
                }
        }
        int[] arr = {max,min};
        return arr;

    }

    public static int findsmallestSubArraywithMin_Max(int[] A, int N,int max,int min){
//1,6,4,2,7,  7,5,1,3,1,1,5
        int smallest_length = 0;
        int l = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            if(A[i]==min){

                for(int j=i;j<N;j++){

                    if(A[j]==max){
                        smallest_length = smallerBTWtwo(l,j-i+1); //5
                        break;
                    }
                }
            }
            if(A[i]==max){

                for(int j=i;j<N;j++){

                    if(A[j]==min){
                        smallest_length = smallerBTWtwo(l, j-i+1);//4 //3
                        break;
                    }
                }
            }
        }
        
        return smallest_length;
    }
    public static int smallerBTWtwo(int a, int b){
        if(a>b){
            return b;
        }else if(b>a){
            return a;
        }else{
            return 0;
        }
    }
}
