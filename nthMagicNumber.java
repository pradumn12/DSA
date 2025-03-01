//Didn't understood the logic clearly

public class nthMagicNumber {
    public static void main(String[] args) {
    
        int ans = solve(6);
        System.out.println("Ans is: "+ans);
    }
    public static int solve(int A) {
        int ans = 0, x = 1;
        // converting to binary representation
        while(A > 0) {
            x *= 5;
            if(A % 2 == 1)    
                ans += x;
            A /= 2;
        }
        return ans;
    }
    
}
