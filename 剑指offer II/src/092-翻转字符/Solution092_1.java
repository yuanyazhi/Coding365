class Solution092_1 {
    public int minFlipsMonoIncr(String s) {
        // dp：分情况讨论
        // 0 - 0: one
        // 0 - 1: dp[i-1] + 1
        // 1 - 0: one + 1
        // 1 - 1: dp[i-1]
        int n = s.length();
        int one = 0;
        int dp = 0;
        for(char c : s.toCharArray()){
            if(c=='0'){
                dp = Math.min(dp+1, one);
            }else{
                dp = Math.min(dp, one+1);
                one++;
            }
        }
        return dp;
    }
}