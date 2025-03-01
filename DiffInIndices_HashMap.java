/*


UNDERSTAND THE SOLUTION

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int diffPossible(final int[] A, int B) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
	    
	    for (int num : A) {
	        if (hashMap.containsKey(num)) {
	            int value = hashMap.get(num);
	            value++;
	            hashMap.put(num, value);
	        } else {
	            hashMap.put(num, 1);
	        }
	    }
	    
	    for (int num : A) {
	        
	        int n = B + num;
	        
	        if (hashMap.containsKey(n)) {
	            if (num == n && hashMap.get(n) > 1)
	                return 1;
	            else if (num != n)
	                return 1;
	        }
	        
	        n = num - B;
	        
	        if (hashMap.containsKey(n)) {
	            if (num == n && hashMap.get(n) > 1)
	                return 1;
	            else if (num != n)
	                return 1;
	        }
	    }
	    
	    return 0;
    }
}
 */

public class DiffInIndices_HashMap {
    
}
