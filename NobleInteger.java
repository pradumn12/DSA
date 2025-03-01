/*T.C O(N2) searcg for O(N) */
/*Noble element: In a given array, find a element p, such that elements greater
than p in value should match with the value of p
eg: 1,3,2,3
Let p=1, element greater than p are 3,2,3 so size = 3 Now 1 is not equal to size 3
Let p=2, element greater than p are 3,3 so size = 2 Now p=2 is equal to size 2
so p=2 is a noble element.
*/
public class NobleInteger {

    public static void main(String[] args) {
        //int[] arr = new int[]{1,1,3,3};
        int[] arr = new int[]{1,2,3,3};
        int N = arr.length;
        int ans = noble(arr, N);
        System.out.println("Result is: "+ans);
    }
    public static int noble(int[] A, int size){

        int result=-1;
        for(int i=0;i<size;i++){
            int count = 0;
            for(int j=0;j<size;j++){
                if(A[j]>A[i]){
                    count++;
                }
            }
            if(A[i]==count){
                System.out.println("Noble element is: "+A[i]);
                return result = 1;
                
            }
        }
        return result;

    }
    
}


