public class StringToggleCasePart2 {
    public static void main(String[] args) {
        String str = "aBcDEFgHiJ";
        //String res = stringToggleUsing32(str);
        //String res = stringToggleUsingazAZ(str);
        String res = stringToggleUsingModulus(str);
        System.out.println("Toggle string is: "+ res);
    }
    public static String stringToggleUsing32(String str){
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='a' && c<='z'){

                sb.append((char)(c-32));

            }else if(c>='A' && c<='Z'){

                sb.append((char)(c+32));
            }
        }
        return sb.toString();
    }
    public static String stringToggleUsingazAZ(String str){
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='a' && c<='z'){

                sb.append((char)(c-('a'-'A')));

            }else if(c>='A' && c<='Z'){

                sb.append((char)(c+('a'-'A')));
            }
        }
        return sb.toString();
    }
    public static String stringToggleUsingModulus(String str){
        
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(c>='a' && c<='z'){

                sb.append((char)(c^32));

            }else if(c>='A' && c<='Z'){

                sb.append((char)(c^32));
            }
        }
        return sb.toString();
    }
    
}
