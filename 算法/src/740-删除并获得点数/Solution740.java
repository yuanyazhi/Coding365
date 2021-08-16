class Solution740 {
    // 动态规划：数组
    public int deleteAndEarn(int[] nums) {
        int[] counts = new int[10001];
        int[] res = new int[10001];
        for(int i=0;i<nums.length;i++){
            counts[nums[i]]++;
        }
        res[1] = counts[1];
        for(int i=2;i<counts.length;i++){
            res[i] = Math.max(res[i-1], res[i-2]+i*counts[i]);
        }
        return res[10000];
    }
    // 动态规划：abc
    public int deleteAndEarn2(int[] nums) {
        int[] counts = new int[10001];
        for(int i=0;i<nums.length;i++){
            counts[nums[i]]++;
        }
        int a = 0, b = counts[1];
        for(int i=2;i<counts.length;i++){
            int c = Math.max(b, a+i*counts[i]);
            a = b;
            b = c;
        }
        return b;
    }
}