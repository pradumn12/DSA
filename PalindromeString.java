public class PalindromeString {
    public static void main(String[] args) {
        String str = "RADAR";
        boolean res = isPalindrome(str);
        System.out.println(str+" string is palindrome: "+res);
    }
    public static boolean isPalindrome(String str){

            //reverse and check
            char ch[] = str.toCharArray();
            char temp;
            int start = 0;
            int end = ch.length-1;
            while(start<end){
                temp = ch[end];
                ch[end] = ch[start];
                ch[start] = temp;
                start++;
                end--;
            }
            String rev_str = new String(ch);
            if(rev_str==str){
                return true;
            }else{
                return false;
            }

    }
}
