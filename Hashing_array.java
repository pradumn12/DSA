public class Hashing_array {
    //Array-Hashing Limited only for input size of 1e7 if defined globally
    public static void main(String[] args) {
        int[] arr = {1,3,2,1,3};
        int n = arr.length;
        int k = 3;
        Solution(arr,n,k);
    }
    public static void Solution(int[] arr,int n, int k){
        int[] hash = new int[13];
        
        for(int i=0;i<n;i++){
            System.out.print(hash[i]+" ");
        }
        System.out.println();
        System.out.println("-----x-----x-----");

        for(int i=0;i<n;i++){
            if(arr[i]==k){
                hash[arr[i]]++;
            }
        }
        for(int i=0;i<13;i++){
            System.out.print(hash[i]+" ");
        }

    }
}
