class Solution {
    public int findUnsortedSubarray(int[] nums) {
        if(nums==null || nums.length<2) return 0;
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=max){
                max = nums[i];
            }else{
                right = i;
            }
            if(nums[nums.length-i-1]<=min){
                min = nums[nums.length-i-1];
            }else{
                left = nums.length-i-1;
            }
        }
        return right==0 ? 0 : right-left+1;
    }
}