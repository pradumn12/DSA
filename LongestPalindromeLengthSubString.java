public class LongestPalindromeLengthSubString {
    public static void main(String[] args) {
        //String str = "xbdyzzydbdyzydx";
        String str = "abcdefghijklbazabc"; // b a z a b // longest sub-string palindrome

        runLoop(str);
    }
    public static void runLoop(String str){

        int max = Integer.MIN_VALUE;
        int arr[] = new int[str.length()];
        for(int i=0;i<str.length();i++){
            int value = isPalindromeGivenPosition(str,i);
            arr[i] = value;
        }
        //Array values
        System.out.println();
        for(int i=0;i<str.length();i++){
            System.out.print(arr[i]+" ");
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Max value is: "+max);


    }
    public static int isPalindromeGivenPosition(String str,int pos){
        char ch[] = str.toCharArray();
        int count = 0;
        for(int i=pos,j= pos;i>=0 && j<=ch.length-1;i--,j++){
            if(ch[i]==ch[j]){
                count++;
            }
        }

        return count*2-1;
    }
}
