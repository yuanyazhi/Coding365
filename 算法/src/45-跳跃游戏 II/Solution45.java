class Solution45 {
    // 贪心：从后往前，找到第一个能够到达最后位置的点，每次都重新遍历，看最少需要多少次
    public int jump1(int[] nums) {
        int position = nums.length-1;
        int step = 0;
        while(position>0){
            for(int i=0;i<nums.length;i++){
                if(nums[i]+i>=position){
                    position = i;
                    step++;
                    break;
                }
            }
        }
        return step;
    }
    // 从左向后一次遍历：记录能到达的最远位置；到达上次的边界后step++
    public int jump2(int[] nums) {
        int max_position = 0;
        int cur_end = 0;
        int step = 0;
        for(int i=0;i<nums.length;i++){
            if(cur_end>=nums.length-1) break;
            max_position = Math.max(max_position, nums[i]+i);
            if(i==cur_end){
                cur_end = max_position;
                step++;
            }
        }
        return step;
    }
}