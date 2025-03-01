/*Given a string s in smallcase, find the count of pairs (i,j) such that
 i<j;
 arr[i]=='a'
 arr[j]=='g'
 */
public class StringPair{
    public static void main(String[] args) {
        char str[] = new char[]{'a','b','c','g','a','g'};
        findPair(str);
    }
    public static void findPair(char arr[]){
        int size = arr.length;
        for(int i=0;i<size;i++){
            int start = 0;
            if(arr[i]=='a'){
                start = i;
                for(int j=i;j<size;j++){
                    int end = 0;
                    if(arr[j]=='g'){
                    end = j;
                    System.out.println("("+start+","+end+")");
                    }
                }
            }
        }
    }

}