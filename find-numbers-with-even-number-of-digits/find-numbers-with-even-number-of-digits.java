class Solution {
    public int findNumbers(int[] nums) {
        int evenNumberOfDigits = 0;
        int counter = 0;
        for(int i = 0; i<nums.length; i++){
            
            while (nums[i]>=1){          //Check how many digits number has
                nums[i] = nums[i]/10;
                counter++;
            }
            
                if(counter%2==0){        //++ if the digits are even
                evenNumberOfDigits++;
                }
            
            counter = 0;                 //reset counter to 0 for next nums[i]
        }
        return evenNumberOfDigits;
    }
}