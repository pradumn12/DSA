public class MissingNumber_usingNaturalSum{
    public static void main(String[] args) {
        int[] arr = {1,2,4,5};
        Solution(arr);
    }
    public static void Solution(int[] arr){
        int n = arr.length;
        int n1 = n+1;
        int s1 = (n1*(n1+1))/2;
        int s2=0;
        for(int i=0;i<n;i++){
            s2+=arr[i];
        }
        System.out.println("Missing number is: "+(s1-s2));
    }
}