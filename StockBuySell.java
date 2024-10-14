public class StockBuySell{
    public static void main(String[] args) {
        int[] arr = {7,1,5,3,6,4};// 7 6 4 3 2 1
        //Solution_BF(arr);
        Solution_Optimal(arr);
    }
    public static void Solution_BF(int[] arr){
        int n = arr.length;
        int profit = 0, max = 0;
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                profit = arr[j] - arr[i];

                if(profit>max){
                    max  = profit;
                }
                if(profit<0){
                    profit = 0;
                }
                
            }
        }
        System.out.println("Max: "+max);
    }


    public static void Solution_Optimal(int[] arr){
        int n = arr.length; //7,1,5,3,6,4
        int min = arr[0];
        int max = 0;
        for(int i=0;i<n-1;i++){
            int diff = arr[i] - min;
            if(diff<0){
                min = arr[i];//1
            }
            if(diff>max){
                max = diff;//5
            }

        }




    }
/* 

    public static void Solution_BF(int[] arr){
        //Two pointers
        int n = arr.length;
        int profit = 0;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                if(arr[j]>arr[i]){
                    profit = Math.max(profit,arr[j]-arr[i]);
                }
            }

        }
        System.out.println("Max profit: "+profit);
    }
        */
}