class Solution581 {
    public int findUnsortedSubarray(int[] nums) {
        if(nums==null || nums.length<2) return 0;
        int left = 0, right = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        // 3个区域：A B C, AC有序，B无序
        // 从左向右：递增，找到最后一个比当前max小的值，此时max为B的最大值，找到的下标为右边界
        // 从右向左：递减，找到最后一个比当前min小的值，此时min为B的最小值，找到的下标为左边界
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