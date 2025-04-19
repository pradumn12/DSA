public class PalindromeSubString_Google_Optimised {
    //TC O(N2)
    public static void main(String[] args) {
        String str = "aaa";
        System.out.println(PalindromeSubString(str));
        
    }
    public static int PalindromeSubString(String str){
        int count = 0;
        int length = str.length();
        int centre = 2*length-1; // 2n-1 (number of centres)

        //Expand from centre
        for(int i = 0; i<centre; i++){
            int left = i/2;
            int right = left + i%2;
            while(left>=0 && right<length && str.charAt(left)==str.charAt(right)){
                count++;
                left--;
                right++;
            }

        }
        return count;
    }
}
