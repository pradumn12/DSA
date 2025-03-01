/*Given a string "ABC DEF GHI" 
 * reverse by word : GHI DEF ABC
*/
public class ReverseWordInSentence_Imp {
    public static void main(String[] args) {
        //String str = "Mailman bring letters";
        String str = "ABC DEF GHI";
        String result = reverseWord(str); //srettel gnirb namliaM
        System.out.println("1st reverse: "+result);
        String finalReverse = reverseLetter(result);
        System.out.println();
        System.out.println("2nd reverse: "+finalReverse);//letters bring Mailman
        System.out.println("size of final reverse 1st: "+finalReverse.length());
        System.out.println("Trim the extra space added at the end: "+finalReverse.trim().length());
    }
    public static String reverseWord(String str){

        char ch[] = str.toCharArray();
        int start = 0;
        int end = ch.length-1;
        char temp;
        while(start<end){

            temp = ch[end];
            ch[end] = ch[start];
            ch[start] = temp;
            start++;
            end--;
        }
        String reverse = new String(ch);
        return reverse;
    }
    public static String reverseLetter(String str){
        
        //srettel gnirb namliaM
        String splitStr[] = str.split(" ");
        System.out.print(splitStr[0]+" "+splitStr[1]+" "+splitStr[2]);
        int size = splitStr.length;
        System.out.println();
        System.out.println("Size of Splitstr is: "+size+" ");
        char temp;
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<size;i++){
            //int start = i;
            //int end = splitStr[i].length()-1;
            char ch[] = splitStr[i].toCharArray();
            int start = 0;
            int end = ch.length-1;//6    //"srettel","gnirb","namliaM"
            while(start<end){//0<6
                temp = ch[end];
                ch[end] = ch[start];
                ch[start] = temp;
                end--;
                start++;
            }
            System.out.println("Individual reversed word: ");
            for(int k=0;k<ch.length;k++){
                System.out.print(ch[k]);
            }
            System.out.println();

            for(int x=0;x<ch.length;x++){
                sb.append(ch[x]);
            }
            sb.append(" ");

        }
        return sb.toString();
        
    }
}
