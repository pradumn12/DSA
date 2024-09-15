import java.util.HashMap;

public class HashMap_Frequency_String {
    public static void main(String[] args) {
        String str = "abbccdapqrabc";
        int n = str.length();
        char ch = 'c';
        Solution(str,n,ch);
    }
    public static void Solution(String str, int n,char ch){
        
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(str.charAt(i))){
                map.put(str.charAt(i),1);
            }else{
                int value = map.get(str.charAt(i));
                map.put(str.charAt(i),value+1);
            }
        }
        System.out.print(map);


    }
}
