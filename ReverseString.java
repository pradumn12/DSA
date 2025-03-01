public class ReverseString {
    public static void main(String[] args) {
        String input = "TheSkyIsPink";
        System.out.println("Reverse string: "+reverse(input));
    }
    public static String reverse(String str){

        char ch[] = str.toCharArray();
        int start = 0, end = ch.length-1;
        char temp;
        while(start<end){
            temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        String finalstr = new String(ch);
        return finalstr;

        /*
         * Or return new String(ch);
         */
    
    }
}
