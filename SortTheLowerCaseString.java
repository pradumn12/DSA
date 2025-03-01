/*Given a string of lower case alphabets sort the string 
 * T.C O(N)
 * S.C O(1)
*/
public class SortTheLowerCaseString {
    public static void main(String[] args) {
        String str = "zzaaddlmbca";
        sortTheString(str);
        
    }
    public static void sortTheString(String str){
        int count[] = new int[26];//by default all the values of the arr of int type will be zero
        
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            int index = c-'a';
            count[index]++;
        }
        /* 
        for(int j=0;j<26;j++){
            System.out.println(count[j]);
        } */
        for(int k=0;k<26;k++){

            for(int i=0;i<count[k];i++){
                //System.out.print(k+'a');// 97
                System.out.print((char)(k+'a'));

            }

        }
        

    }
}
