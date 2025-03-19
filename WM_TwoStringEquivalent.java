import java.util.HashMap;

public class WM_TwoStringEquivalent {
    public static void main(String[] args) {
        checkAlmostEquivalent("abcdeef","abaaacc");
    }
    public static boolean checkAlmostEquivalent(String word1, String word2) {
    
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:word1.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0) + 1);
            
        }
        System.out.println(map);
        return false;
    
}
