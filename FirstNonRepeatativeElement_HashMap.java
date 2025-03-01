import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatativeElement_HashMap {
    public static void main(String[] args) {
        int arr[] = {8,2,8,7,1,2,6,5};
        int n = arr.length;
        int element = firstNonRepeat(arr,n);
        System.out.println("First non - repetative element is: "+arr[element]);
    }
    public static int firstNonRepeat(int[] arr, int N){


            HashMap<Integer,Integer> map = new HashMap<>();
            //O(N)
            for(int i=0;i<N;i++){
                if(!map.containsKey(arr[i])){
                    map.put(arr[i], 1);
                }else{
                    map.put(arr[i],map.get(arr[i])+1);
                }
            }
            System.out.println("Print HashMap");
            System.out.println(map);

            int count = 0;
            //O(N)
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                if(entry.getValue()==1){
                    count++;
                }
            }
            int newarr[] = new int[count];

            int i=0;
            //O(N)
            for(Map.Entry<Integer,Integer> entry : map.entrySet()){
                
                if(entry.getValue()==1){
                    newarr[i] = entry.getKey();
                    i++;
                }

            }

            System.out.println("-----x----x------x");
            System.out.println("Elements which are repeated only once");
            for(int j=0;j<count;j++){
                System.out.print(newarr[j]+" ");
            }

            int min = Integer.MAX_VALUE;
            //{8,2,8,3,1,2,6,5}
            //1,3,5,6

            //O(N2)
            for(int m=0;m<count;m++){
                for(int n=0;n<N;n++){
                    if(newarr[m]==arr[n]){
                        if(n<min){
                            min = n;    
                        }
                    }
                }
                

            }
            System.out.println("Minimum Index value : "+min);
            return min;
    }
}


/*Explanation of Time Complexity:
1)The code iterates through the input array once to populate a HashMap with the frequency of each element. 
This initial loop has a time complexity of O(N), where N is the number of elements in the array.

2)Then, the code iterates through the HashMap to find elements with a frequency of 1. 
This loop also has a time complexity of O(N) in the worst case scenario.

3)Subsequently, a new array is created with the non-repeating elements, which involves iterating through the HashMap again. 
This operation has a time complexity of O(N) as well.

4)Finally, the code searches for the minimum index of the non-repeating element in the original array. 
This involves nested loops, resulting in a time complexity of O(N^2) in the worst case scenario.

Overall Time Complexity:
Combining the time complexities of the individual operations, 
the overall time complexity of the code is O(N) + O(N) + O(N) + O(N^2) = O(N^2), 
where N is the number of elements in the input array.
In summary, the time complexity of the provided code is quadratic, O(N^2), due to the nested loop used to find the minimum index of the non-repeating element. */







/*Space Complexity Analysis:
The code uses a HashMap to store the frequency of each element in the input array. 
The space required by the HashMap is proportional to the number of unique elements in the array. 
In the worst case scenario where all elements are unique, the HashMap would store N unique elements, resulting in a space complexity of O(N) 


Additionally, the code creates a new array to store the non-repeating elements, 
which would also occupy space proportional to the number of non-repeating elements. 
This array has a space complexity of O(N) in the worst case


Furthermore, the code uses additional variables and data structures like integers and loops, 
which require constant space regardless of the input size.

Overall Space Complexity:
Combining the space complexities of the HashMap, the new array, and other variables, 
the overall space complexity of the code is O(N), 
where N is the number of elements in the input array.

In summary, the space complexity of the provided code is linear, O(N), 
due to the HashMap and the new array used to store the non-repeating elements, 
along with other constant space requirements. */