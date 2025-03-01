public class PalindromeStringGivenPosition {
    public static void main(String[] args) {
        //String str = "MLKZADAZKLM";
        String str = "xbdyzzydbdyzydx";//xbdyz z y d b d y z ydx   b=8
        int position = 8;
        int res = isPalindromeGivenPosition(str,position);
        System.out.println("Length of given palindrome given position: "+res);
    }
    public static int isPalindromeGivenPosition(String str,int pos){
        char ch[] = str.toCharArray();
        int count = 0;
        for(int i=pos,j= pos;i>=0 && j<=ch.length-1;i--,j++){
            if(ch[i]==ch[j]){
                count++;
            }
        }
        if(count==1){
            return 1;
        }

        return count*2-1;
    }
}
