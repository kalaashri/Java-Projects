package Java;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(1, 2);
        map.put(2, 3);
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        // In case there is no solution, we'll just return null
        return null;
    }
    
    
    
    public static void main(String args[])
    {
    	int nu[]= {1,2,3};
    	int tar=5;
    	int ou[]=null;
    	ou=twoSum(nu,tar);
    	 for (int i = 0; i < ou.length; i++)
    	System.out.println(ou[i]);
    	
    }
}


