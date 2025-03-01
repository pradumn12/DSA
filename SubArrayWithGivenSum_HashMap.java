import java.util.HashMap;

public class SubArrayWithGivenSum_HashMap {
    public static void main(String[] args) {
        int A[] = {8,-2,3,4,2,-1,6};
        int B = 5;
        int res[] = subArray(A,B);
        System.out.println("Final sub-array: ");
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] subArray(int A[], int B){/*0 -1; 8 0; 6 1;9 2;13  */

        long sum = 0;
        HashMap<Long,Integer> map = new HashMap<>();// sum vs index storage
        int s=-1,e=-1;
        map.put(0l,-1);
        for(int i=0;i<A.length;i++){

            sum+=A[i];
            if(map.containsKey(sum-B)==true){
                s = map.get(sum-B)+1;
                e = i;
                break;
            }
            map.put(sum,i);
        }
        if(s==-1){
            int res[] = {-1};
            return res;
        }
        int res[] = new int[e-s+1];
        int k=0;
        for(int i=s;i<=e;i++){
            res[k] = A[i];
            k++;
            
        }

        return res;

    }
    
}
