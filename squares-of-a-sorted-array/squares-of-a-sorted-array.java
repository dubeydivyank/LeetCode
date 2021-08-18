class Solution {
    public int[] sortedSquares(int[] nums) {
        //create new array to store squared and sorted elements of nums[]
        int [] result = new int[nums.length];
        //create left & right pointers
        int l = 0;
        int r = nums.length-1;
        /*
        iterate from right to left and store the squared numbers in result[]
            we will compare the leftmost and rightmost element of nums[]
            and store the larger value at last index of result[]
            and update the pointers
        */
        for(int i = r; i>=0; i--){
            if(Math.abs(nums[l])>=Math.abs(nums[r])){
                result[i] = nums[l]*nums[l];
                l++;
            }
            else if(Math.abs(nums[l])<Math.abs(nums[r])){
                result[i] = nums[r]*nums[r];
                r--;
            }
        }
        return result;
    }
}