public class NumberAppearOnce_XOR {
    public static void main(String[] args) {
        int res[] = {4,1,2,1,2};
        Solution(res);
    }
    public static void Solution(int[] arr){
        int xor1 = 0;
        for(int i=0;i<arr.length;i++){
            xor1 = xor1 ^ arr[i];
        }
        System.out.println("One Appreance num: "+xor1);
    }
}
