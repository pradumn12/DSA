public class SecondSmallestLargestElement{

    public static void main(String[] args) {
        int arr[] = {1,2,4,7,7,5};
        secondElement(arr);
    }
    public static void secondElement(int arr[]){
        int n = arr.length;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(min>arr[i]){
                min = arr[i];

            }else if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Min: "+min);
        System.out.println("Max: "+max);
        int second_min = Integer.MAX_VALUE;
        int second_max = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(second_min>arr[i] && arr[i]!=min){
                second_min = arr[i];
            }
            if(arr[i]>second_max && arr[i]!=max){
                second_max = arr[i];
            }
        }

        System.out.println("Second Min: "+second_min);
        System.out.println("Second Max: "+second_max);
    }
}