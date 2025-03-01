//T.C O(N) S.C O(1)
public class ExcelColumnNumber {
    public static void main(String[] args) {
        String str = "AB";
        int res = excelColumnNumFinder(str);
        System.out.println("Column number for "+str + " is: "+res);
    }
    public static int excelColumnNumFinder(String str){

        int n = str.length();
        int ans = 0;
        int powerOf26 = 1;
        for(int i = n-1;i>=0;i--){
            ans+= powerOf26*(str.charAt(i)-'A' +1);
            powerOf26*=26;
        }
        return ans;
    }
}
