import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] twoNums = new int [2];
		Map <Integer, Integer> hmap = new HashMap<>();
        
		for(int i = 0; i<nums.length; i++){
			if(hmap.containsKey(target - nums[i])){
				twoNums[0] = hmap.get(target - nums[i]);
				twoNums[1] = i;
			}
            else{
				hmap.put(nums[i] , i);
			}	
		}
        return twoNums;
    }
}