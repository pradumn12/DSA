import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] example = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(groupAnagrams(example));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map = new HashMap<>();

        for(String str:strs){
            String order_string = frequencyString(str);
            if(map.containsKey(order_string)){
                map.get(order_string).add(str);
            }else{
                List<String> new_arrList = new ArrayList<>();
                new_arrList.add(str);
                map.put(order_string, new_arrList);
            }
        }

        return new ArrayList<>(map.values());
    }
    public static String frequencyString(String str){

        int[] freq = new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder strbuild = new StringBuilder("");
        char c = 'a';
        for(int i:freq){
            strbuild.append(c);
            strbuild.append(i);
            c++;
        }
        return strbuild.toString();
    }
    
}
