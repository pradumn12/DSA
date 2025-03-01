/*There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, given by the 2D array B 

Input 1:-
A = 5
B = [[1, 2, 10], [2, 3, 20], [2, 5, 25]]

Output 1:-
10 55 45 25 25

Explanation 1:-
First devotee donated 10 coins to beggars ranging from 1 to 2. Final amount in each beggars pot after first devotee: [10, 10, 0, 0, 0]
Second devotee donated 20 coins to beggars ranging from 2 to 3. Final amount in each beggars pot after second devotee: [10, 30, 20, 0, 0]
Third devotee donated 25 coins to beggars ranging from 2 to 5. Final amount in each beggars pot after third devotee: [10, 55, 45, 25, 25]*/

public class ContinousSumQuery{
    public static void main(String[] args) {
        int arr[] = new int[]{0,0,0,0,0};
        int A[] = getResultantArray(arr,1,2,10);
        int B[] = getResultantArray(A,2,3,20);
        int C[] = getResultantArray(B,2,5,25);
        int D[] = getPrefixSumArray(C);
        System.out.println();
        for(int i=0;i<D.length;i++){
            System.out.print(D[i]+" ");
        }
    }
    public static int[] getResultantArray(int[] A,int start, int end, int value){

        start-=1;
        end-=1;
        A[start]+=value;
        if(end<A.length-1){
            A[end+1]-=value;
        }
        return A;
    }
    public static int[] getPrefixSumArray(int[] A){

        int[] ps = new int[A.length];
        ps[0] = A[0];
        for(int i=1;i<A.length;i++){
            ps[i] = ps[i-1] + A[i];
        }
        return ps;
    }
}