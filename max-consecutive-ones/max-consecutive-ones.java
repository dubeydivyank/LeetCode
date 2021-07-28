class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int counter = 0;
        int maxConsecutive_1s = 0;
        for(int i=0; i<nums.length; i++){
            if (nums[i]==1){
                counter++;
                if (counter>maxConsecutive_1s){
                    maxConsecutive_1s=counter;
                }
            }    
            else { counter = 0;
            }
        }
            return maxConsecutive_1s;
    }
}