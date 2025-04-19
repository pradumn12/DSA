import java.util.ArrayList;
import java.util.List;
// TC O(N3)
public class PalindromeSubString_Google_BF {
    public static void main(String[] args) {

         //findAllSubString_forLoop(s);

        int result = 0;
        String s = "abc";
        List<String> collectSubString = new ArrayList<>();
        findAllSubstring_Recursion(s,0,0,collectSubString);
        System.out.println("Possible sub strings are: "+collectSubString);
       
        for(String str: collectSubString){
            if(isPalindrome(str)){
                result++;
            }
        }
       System.out.println("Number of sub string which are palindrome are: "+result);
    }
    
    public static void findAllSubstring_Recursion(String str, int start, int end,List<String> collect){

        if(start==str.length()){
            return;
        }else if(end==str.length()){
            start++;
            end = start;
            findAllSubstring_Recursion(str, start, end,collect);
        }
        else{
            collect.add(str.substring(start, end+1));
            findAllSubstring_Recursion(str, start, end+1,collect);
        }

    }
    public static boolean isPalindrome(String s){
        int l = 0, r = s.length()-1;
        while(l<r){
            if(s.charAt(l++)!=s.charAt(r--)){
                return false;
            }
        }
        return true;
    }

    public static void findAllSubString_forLoop(String str){

        for(int i=0;i<str.length();i++){

            for(int j=i+1;j<=str.length();j++){
                System.out.println(str.substring(i, j));
            }

        }
    }
}
