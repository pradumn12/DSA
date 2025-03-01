import java.util.Arrays;
//T.C Sorting + One time iteration = O(nlogn + N) = O(nlogn) which is better than O(n2)
public class NobleInteger_Betterapproach {
    public static void main(String[] args) {
        //int[] arr = {6,8,2,4,5,1,10};
        //int[] arr = {1,1,3,1};
        int[] arr = {6,8,4,4,5,1,10};
        int result = nobleElement(arr);
        if(result==-1){
            System.out.println("No noble element found");
        }else{
            System.out.println("Noble element is: "+result);
        }
    }
    public static int nobleElement(int[] arr){

        int[] temp = arr;
        Arrays.sort(temp); 
        //1,2,4,5,6,8,10
        for(int i=0;i<temp.length;i++){
            int n = temp.length-(i+1); // 7- (i+1)
            if(temp[i]==temp[i+1]){ // To handle the multiple occurance of same digit // 1,4,4,5,6,8,10
                continue;
            }else if(n==temp[i]){
                System.out.println("index at which noble ele is found: "+i);
                return temp[i];
            }
        }
        return -1;
    }
    
}



/*

Check for          //-6,-4,-2,-1,0 N = 5

public class Solution {
    public int solve(int[] A) {
        int[] temp = A;
        Arrays.sort(temp); 
        //-6,-4,-2,-1,0 N = 5
        for(int i=1;i<temp.length;i++){
            int n = temp.length-(i); // 7- (i+1)
            if(temp[i-1]==temp[i]){ // To handle the multiple occurance of same digit // 1,4,4,5,6,8,10
                continue;
            }else if(n==temp[i-1]){
                //System.out.println("index at which noble ele is found: "+i);
                return 1;
            }
        }
        return -1;
    }
}
 */
