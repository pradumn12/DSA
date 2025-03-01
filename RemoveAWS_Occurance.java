public class RemoveAWS_Occurance{
    //Given a String, remove all the occurance of AWS until no more remain. return the final string or -1 if empty
    public static void main(String[] args) {
        String s = "ABAWSBAWS";// AAWSWS -> AWS -> -1 //ABCDWS -> ABCDWS
        String removal_string = "AWS";
        String result = removeAWS(s,removal_string);
        System.out.println(result);
        
    }
    public static String removeAWS(String s,String aws){
       
        StringBuffer inputString = new StringBuffer(s);
        while(true){
            int position = inputString.indexOf(aws);
            if(position==-1){
                break;
            }
            inputString = inputString.delete(position, position+aws.length());
        }

        return inputString.toString();
    }
    
}