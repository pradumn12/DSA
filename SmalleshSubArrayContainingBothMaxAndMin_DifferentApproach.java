public class SmalleshSubArrayContainingBothMaxAndMin_DifferentApproach {
    public static void main(String[] args) {
        int[] arr = new int[]{1,6,4,2,7,7,5,1,3,1,1,5};
        int size = arr.length;
        int max_min[] = Max_Min(arr,size);
        System.out.println("Max value is: "+max_min[0]+" Min value is: "+max_min[1]);
        int length = findsmallestSubArraywithMin_Max(arr,size,max_min[0],max_min[1]);
        System.out.println("Smallest length of sub-array having both Min and Max value is: "+length);

    }

    public static int findsmallestSubArraywithMin_Max(int[] A, int N,int max,int min){

        int smallest_length = Integer.MAX_VALUE;
        int min_ptr = -1;
        int max_ptr=-1;
//0,1,2,3,4,5,6,7,8,9,10,11        
//1,6,4,2,7,7,5,1,3,1,1,5
        for(int i=0;i<N;i++){
            if(A[i]==min){
                //System.out.println("Found min value at index: "+i+" value is: "+A[i]);
                min_ptr = i;
                if(min_ptr!=-1 && max_ptr!=-1){
                    //System.out.println("Both min and max value is not -1 at index: "+i+" value is: "+A[i]);
                    smallest_length = smallerBTWtwo(smallest_length, absoluteValue(min_ptr,max_ptr));
                    //System.out.println("ith value: "+i+" Smallest length found: "+smallest_length);
                }
            }
            if(A[i]==max){
                //System.out.println("Found max value at index: "+i+" value is: "+A[i]);
                max_ptr=i;
                if(min_ptr!=-1 && max_ptr!=-1){
                    //System.out.println("Both min and max value is not -1 at index: "+i+" value is: "+A[i]);
                    smallest_length = smallerBTWtwo(smallest_length, absoluteValue(min_ptr, max_ptr));
                    //System.out.println("ith value: "+i+" Smallest length found: "+smallest_length);
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
    public static int absoluteValue(int a , int b){
        if(a-b>0){
            return a-b+1;
        }else if(a-b<0){
            return b-a+1;
        }else{
            System.out.println("Hi");
            return 0;
        }
    }
}

