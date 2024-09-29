public class MissingNumber_usingXOR {
    public static void main(String[] args) {
        int[] arr = {2,9,7,1,5,3,6,8,10};
        Solution(arr);
    }
    public static void Solution(int[] arr){
        int n = arr.length;
        int xor1=0,xor2=0;

        for(int i=1;i<n+2;i++){
            xor1 = xor1 ^ i;
        }
        System.out.println("XOR1: "+xor1);

        for(int i=0;i<n;i++){
            xor2 = xor2 ^ arr[i];
        }
        System.out.println("XOR2: "+xor2);
        int result = xor1 ^ xor2;
        System.out.println("Missing number is :"+ result);

    }
}
