public class Hashing_string {
    //Array Hashing
    public static void main(String[] args) {
        String str = "abbccdapqrabc";
        int n = str.length();
        char ch = 'c';
        Solution(str,n,ch);
    }
    public static void Solution(String str,int n,char c){
        int[] hash  = new int[26];// Assumption all the char in String are smallcase
        int index = 0;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==c){

                index = c-'a';// if Uppercase are present
                hash[index]++;
            }
        }
        for(int i=0;i<26;i++){
            System.out.print(hash[i]+" ");
        }

    }
}
