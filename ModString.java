public class ModString {
    public static void main(String[] args) {
        //ModString("43535321",47);
        modString("2264", 3);
    }
    public static void modString(String A, int B){
        long ans = 0;
        long mod = B;
        int n = A.length();
        long curr = 1;
        for(int i = n - 1; i >= 0; i--){
            long dig = A.charAt(i) - 48;
            System.out.println("Dig value: "+dig);

            long term = (dig * curr) % mod; // 3*1%3
            System.out.println("Term value: "+term);

            ans = (ans + term) % mod;
            System.out.println("Ans value: "+ans);

            curr = (curr * 10) % mod;
            System.out.println("curr value: "+curr);

            System.out.println("-----x----");
        }
        System.out.println("Final answer is: "+ans);

    }
}
