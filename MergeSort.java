import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {9,4,7,6,3,1,5};

        System.out.println("Before sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        
        Solution.mergeSort(arr,0,arr.length-1);

        System.out.println("After sorting array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        
    }
}

class Solution
{
    private static void merge(int arr[], int l, int m, int r)
    {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = l;
        int right = m+1;
        while(left<=m && right<=r){
            if(arr[left]<=arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left<=m){
            temp.add(arr[left]);
            left++;
        }
        while(right<=r){
            temp.add(arr[right]);
            right++;
        }
        for(int i=l;i<=r;i++){
            arr[i] = temp.get(i-l);
        }
        
    }
    public static void mergeSort(int arr[], int l, int r)
    {
        if(l>=r) return;
        int mid = (l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
}
