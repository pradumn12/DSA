

public class ABPositiveModulo {
    public static void main(String[] args) {
    //int res1 = PositiveModulo(6,12); //T.C = O(N) & S.C = O(1)
    int res2 = betterPositiveModulo(3582353,2636654); //T.C = O(N) & S.C = O(1)
    
    System.out.println("Ans is :"+ res2);
    }
    public static int betterPositiveModulo(int A, int B){

            if(A>B){
                return A-B;
            }else{
                return B-A;
            }
    }



    public static int PositiveModulo(int A, int B){

        int biggerPositiveFactor = 0;
        if(A>B){
            for(int i=1;i<=A;i++){
                if(B%i==A%i){
                        if(i>biggerPositiveFactor){
                            biggerPositiveFactor = i;
                        }
                    
                }
            }
            System.out.println("Biggest positive factor is 1st if: "+biggerPositiveFactor);
        }else if(B>A){
            for(int i=1;i<=B;i++){
                if(A%i==B%i){
                        if(i>biggerPositiveFactor){
                            biggerPositiveFactor = i;
                        }
                }
            }
            System.out.println("Biggest positive factor is 2nd else if: "+biggerPositiveFactor);
            
        }
        return biggerPositiveFactor;
    }
}
