import java.util.Arrays;

class Solution322 {
    // 背包问题：动态规划
    // res[i][j]: i:第i个硬币  j:通过决定选择该硬币后，得到j最少需要的硬币数量
    // res[j]: j:通过决定选择该硬币后，得到j最少需要的硬币数量
    public int coinChange(int[] coins, int amount) {
        int[] res = new int[amount+1];
        Arrays.fill(res,amount+1);
        for(int i=0;i<coins.length;i++){
            res[0] = 0;
            for(int j=0;j<=amount;j++){
                if(j>=coins[i]) res[j] = Math.min(res[j-coins[i]]+1,res[j]);
            }
        }
        return res[amount]==amount+1 ? -1 : res[amount];
    }
}