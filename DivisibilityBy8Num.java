public class DivisibilityBy8Num {
    public static void main(String[] args) {
        int ans = checkDivisibilityBy8("8");
        System.out.println("Ans: "+ans);
    }
    public static int checkDivisibilityBy8(String A){
        int n = A.length();
        if(n==1){
            System.out.println("n was A");
            if((A.charAt(0)-'0') % 8==0){
                System.out.println("n was 1");
                return 1;
            }
            return 0;
        }else if(n==2){
            System.out.println("n was B");
            if(((A.charAt(0)-'0')*10 + A.charAt(1)-'0') % 8 ==0 ){
                System.out.println("n was 2");
                return 1;
            }
            return 0;
        }else{
            
            int value = (A.charAt(n-3)-'0')*100 + (A.charAt(n-2)-'0')*10 + (A.charAt(n-1)-'0');
            System.out.println("print value: "+value);
            
            if(((A.charAt(n-3)-'0')*100 + (A.charAt(n-2)-'0')*10 + (A.charAt(n-1)-'0') ) % 8 ==0 ){
                System.out.println("n was of more length");
                return 1;
            }
            return 0;
        }

    }
}
