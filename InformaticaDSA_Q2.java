import java.util.HashMap;

public class InformaticaDSA_Q2 {
    /*a DSA question given a string of array consisting of 
    {"abc","gpq","cdg","qrt","tvb","bwz"}
return me a string "abcdgpqrtvbwz" the condition here is it should start with a and 
ends with z, and the concatinating string 
should have the first character same as the last character of previous string. */
    public static void main(String[] args) {
        String[] arr = {"abc", "gpq", "cdg", "qrt", "tvb", "bwz"};
        String result = arrangeStrings(arr);
        System.out.println(result);
    }
    public static String arrangeStrings(String[] arr){

        HashMap<Character,String> map = new HashMap<>();
        for(String str: arr){
            char first_char = str.charAt(0);
            if(!map.containsKey(first_char)){
                map.put(first_char,str);
            }
        }
        System.out.println(map);

        String str = map.get('a');
        System.out.println(str);
        StringBuilder strbuild = new StringBuilder(str);
        char last_char = str.charAt(str.length()-1);
        System.out.println("last: "+last_char);

        while(map.containsKey(last_char)){
            String current = map.get(last_char);
            strbuild.append(current.substring(1));
            last_char = current.charAt(str.length()-1);
            
        }
        if(last_char != 'z'){
            
            return new String("End is not z");
            
        }else{
            return strbuild.toString();
        }
    }
}
