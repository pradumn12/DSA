/*Given an array remove all the elements from an array such that 
 * cost of removing the element  =  sum of array elements before the removal
 * Find the minimum cost
 * eg: [2,3,1,4]
 * step 1: [2,3,1] sum 2+3+1+4 = 10
 * step 2: [2,1] sum = 2+3+1 = 6
 * step 3: [1] sum = 2+1 = 3
 * step 4: [] sum = 1
 * total sum  = 10+6+3+1 = 20 (its should be minimum from all other possibility)
 * Approach: try removing the maximum element from arr, so it can't be repeated in the sum again.
 */
public class RemoveElementFromArray_BF {
    
    
}
