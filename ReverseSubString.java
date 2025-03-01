/*Given a string, reverse sub-string with a given start and end index 
 * T.C O(N)
 * S.C O(N)
*/
public class ReverseSubString {
    public static void main(String[] args) {

        String str = "abcdefkljm";
        int start = 2;
        int end =5;
        String reverse_string = reverseSubString(str, start, end);
        System.out.println("Reverse sub string: "+ reverse_string);
        
    }
    public static String reverseSubString(String str,int start, int end){
        char ch[] = str.toCharArray();
        char temp;

        /* 
        for(;start<end;start++,end--){
            temp = ch[end];
            ch[end] = ch[start];
            ch[start] = temp;
            
        }
        OR */
        while(start<end){
            temp = ch[end];
            ch[end] = ch[start];
            ch[start] = temp;
            start++;
            end--;
        }

        String newStr = new String(ch);
        return newStr;
    }
}
