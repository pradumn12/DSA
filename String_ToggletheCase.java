public class String_ToggletheCase {
    public static void main(String[] args) {
        String str = "aBcAEd";
        String result = ToggletheCase(str);
        System.out.println("Result is : "+result);
    }
    public static String ToggletheCase(String str){
        /* 'a' 97        'A'  65
            'z' 122       'Z' 90
        */
        StringBuilder strBuild = new StringBuilder();
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            if(str.charAt(i)>='a' && str.charAt(i)<='z'){
            
                strBuild.append((char)(c-32)); // a -> A
                //strBuild.append((c-32)); // a -> 65
                

            }else if(str.charAt(i)>='A' && str.charAt(i)<='Z'){
                
                strBuild.append((char)(c+32)); // C -> c
                //strBuild.append((c+32)); // C -> 67

            }else{
                System.out.println("Invalid Input");
            }
        }

        return strBuild.toString();
    }
}
