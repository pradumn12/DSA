public class Math {
    public static void main(String[] args) {

        double value = log10(11.33333455);
        int a = (int) value;
        
        //System.out.println("value in double is: "+value);
        System.out.println("value in int is: "+a);

    }
    public static double log10(double a){

        double result = Math.log10(a);
        System.out.print("Value: "+ result);
        return result;
    }
    
}
