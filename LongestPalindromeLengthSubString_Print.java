public class LongestPalindromeLengthSubString_Print {
    public static void main(String[] args) {
        //String str = "xbdyzzydbdyzydx";
        //String str = "abcdefghijklbazabc"; // b a z a b // longest sub-string palindrome
        String str = "abb";
        int len[] = runLoop(str);
        String finalStr = isPalindromeGivenString(str, len[0], len[1]);
        System.out.println("Final longest sub-string is: "+finalStr);

    }
    public static int[] runLoop(String str){

        //int string_len = str.length();
        int max = Integer.MIN_VALUE;
        int arr[] = new int[str.length()];
        for(int i=0;i<str.length();i++){
            int value = isPalindromeGivenPosition_OddLength(str,i);
            arr[i] = value;
        }
        //Array values
        System.out.println();
        for(int i=0;i<str.length();i++){
            System.out.print(arr[i]+" ");
        }
        
        int max_index = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
                max_index = i;
                
            }
        }
        System.out.println("Max value is: "+max);
        int final_value[] = {max_index,max};
        return final_value;
    }
    public static int isPalindromeGivenPosition_OddLength(String str,int pos){
        char ch[] = str.toCharArray();
        int count = 0;
        for(int i=pos,j= pos;i>=0 && j<=ch.length-1;i--,j++){
            if(ch[i]==ch[j]){
                count++;
            }
        }

        return count*2-1;
    }
    public static int isPalindromeGivenPosition_EvenLength(String str,int pos){
        char ch[] = str.toCharArray();
        int count = 0;
        for(int i=pos,j= pos+1;i>=0 && j<=ch.length-1;i--,j++){
            if(ch[i]==ch[j]){
                count++;
            }
        }

        return count*2-1;
    }
    public static String isPalindromeGivenString(String str,int pos,int size){
        StringBuilder sb = new StringBuilder();
        char ch[] = str.toCharArray();

        for(int i=pos-(size/2);i<pos;i++){
            sb.append(ch[i]);
        }

        for(int i=pos;i<=pos+(size/2);i++){
            sb.append(ch[i]);
        }
        
        return sb.toString();
    }
    

    
}
