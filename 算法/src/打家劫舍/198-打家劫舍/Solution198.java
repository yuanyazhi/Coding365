class Solution198 {
    // 动态规划：数组
    public int rob(int[] nums) {
        int[] res = new int[nums.length+1];
        res[1] = nums[0];
        for(int i=2;i<=nums.length;i++){
            res[i] = Math.max(res[i-1],res[i-2]+nums[i-1]);
        }
        return res[nums.length];
    }
    // 动态规划：a b c
    public int rob2(int[] nums) {
        int a = 0, b = nums[0];
        for(int i=2;i<=nums.length;i++){
            int c = Math.max(b,a+nums[i-1]);
            a = b;
            b = c;
        }
        return b;
    }
}