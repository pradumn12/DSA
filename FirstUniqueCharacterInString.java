import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public static void main(String[] args) {
        String str = "leetcode";
        //int result1  = Solution_UsingHashMap(str);
        int result2  = Solution_UsingFrequencyArray(str);
        
        System.out.println(result2);
    }
    public static int Solution_UsingHashMap(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        char ch[] = str.toCharArray();
        for(int i=0;i<str.length();i++){
            if(!map.containsKey(ch[i])){
                map.put(ch[i],1);
            }else{
                map.put(ch[i],map.get(ch[i])+1);
            }
        }
        for(int i=0;i<str.length();i++){
            if(map.get(ch[i])==1){
                return i+1;
            }else{
                continue;
            }
        }
        return -1;
    }

    public static int Solution_UsingFrequencyArray(String s){

        int[] freq = new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[s.charAt(i) - 'a'] == 1 ){
                return i+1;
            }
        }


        return -1;
    }
}
