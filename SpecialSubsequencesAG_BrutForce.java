/*You have given a string A having Uppercase English letters.

You have to find how many times subsequence "AG" is there in the given string.
Eg. A = "ABCGAG"
will have AG sub sequence 3 times (0,3) (0,5) (4,5) */
public class SpecialSubsequencesAG_BrutForce {
    public static void main(String[] args) {
        String str = "ABCGAG";
        int length = str.length();
        char[] ch = changeStringToCharArray(str,length);
        int count = countSubSequence(ch,length);

        System.out.println("Count of sub-sequence is: "+count);
    }

    public static int countSubSequence(char[] ch, int size){
        int count = 0;
        for(int i=0;i<size;i++){
            if(ch[i]=='A'){
                for(int j=i;j<size;j++){
                    if(ch[i]=='A' && ch[j]=='G'){
                        count++;
                        System.out.println("Index of A: "+i+" index of G: "+j);
                    }
                }
            }
            /*  it will check Sub-sequence "GA" not required in this question but helpful if question ask 
            for sub-sequence count of "A...G" & "G...A" combined.
            if(ch[i]=='G'){
                for(int j=i;j<size;j++){
                    if(ch[i]=='G' && ch[j]=='A'){
                        count++;
                        System.out.println("Index of G: "+i+" index of A: "+j);
                    }
                }
            }*/
        }

        return count;
    }

    public static char[] changeStringToCharArray(String str,int size){
        char charArr[] = new char[size];
        System.err.print("[ ");
        for(int i=0;i<size;i++){
            charArr[i]=str.charAt(i);
            System.err.print(charArr[i]+" ");
        }
        System.out.println("]");
        return charArr;
    }
    
}
