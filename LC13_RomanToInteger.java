import java.util.HashMap;

public class LC13_RomanToInteger{
    public static void main(String[] args) {
        String str = "MCMXCIV";
        System.out.println(Solution(str));
        
    }
    public static int Solution(String s){
        int result = 0;

        String roman_string = "IVXLCDM";
        int len = s.length()-1;
        int[] roman_arr = {1,5,10,50,100,500,1000};
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<roman_string.length();i++){
            map.put(roman_string.charAt(i),roman_arr[i]);
        }

        for(int i=0;i<len;i++){
//Taking two character everytime and compare
            if(map.get(s.charAt(i))>=map.get(s.charAt(i+1))){// for "III" and "MCMXCIV"
                result+=map.get(s.charAt(i));
            }else if(map.get(s.charAt(i))<map.get(s.charAt(i+1))){
                result-=map.get(s.charAt(i));
            }
        }
        result+=map.get(s.charAt(len));// last char always added

        return result;


    }
}