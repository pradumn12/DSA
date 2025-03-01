/*You have given a string A having Uppercase English letters.
You have to find how many times subsequence "AG" is there in the given string.
Eg. A = "ABCGAG"
will have AG sub sequence 3 times (0,3) (0,5) (4,5) */

/*While going from left to right, we are checking how many A's are present before getting G. In order to 
 * create the pattern "AG"
 */
public class SpecialSubsequencesAG_BetterApproach {
    public static void main(String[] args) {
        String str = "AGAABCGAA";//"ABCGAG";
        int length = str.length();
        char[] ch = changeStringToCharArray(str,length);
        int countLtoR = countSubSequenceFromLtoR(str,length);
        System.out.println("Count of sub-sequence from Left to right is: "+countLtoR);


        int countRtoL = countSubSequenceFromRtoL(ch,length);
        System.out.println("Count of sub-sequence of right to left is: "+countRtoL);
    }

    public static int countSubSequenceFromLtoR(String ch, int size){
        
        int count=0,ans=0;
        //Going from Forward and checking for sub sequence "A...G"
        for(int i=0;i<size;i++){
            if(ch.charAt(i)=='A'){
                count++;
            }else if(ch.charAt(i)=='G'){
                ans+=count;
                //ans=(ans+count)%1000000007 -> to pass the testcase where value of ans exceed the int limit.
            }
        }
        return ans;
    }
    public static int countSubSequenceFromRtoL(char[] ch, int size){
        
        int count=0,ans=0;
        //Going from Forward and checking for sub sequence "A...G"
        for(int i=size-1;i>=0;i--){
            if(ch[i]=='G'){
                count++;
            }else if(ch[i]=='A'){
                ans+=count;
            }
        }
        return ans;
    }

    public static char[] changeStringToCharArray(String str,int size){
        char charArr[] = new char[size];
        System.err.print("[ ");
        for(int i=0;i<size;i++){
            charArr[i]=str.charAt(i);
            System.out.print(charArr[i]+" ");
        }
        System.out.println("]");
        return charArr;
    }
    
}

