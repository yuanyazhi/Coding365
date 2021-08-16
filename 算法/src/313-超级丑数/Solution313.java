// 超级丑数 是一个正整数，并满足其所有质因数都出现在质数数组 primes 中。
// 给你一个整数 n 和一个整数数组 primes ，返回第 n 个 超级丑数 。
// 题目数据保证第 n 个 超级丑数 在 32-bit 带符号整数范围内。

class Solution313 {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n==1) return 1;
        int[] indexs = new int[primes.length];
        int[] res = new int[n];
        res[0] = 1;
        for(int i=1;i<n;i++){
            int temp = Integer.MAX_VALUE;
            for(int j=0;j<primes.length;j++){
                temp = Math.min(temp, res[indexs[j]]*primes[j]);
            }
            res[i] = temp;
            for(int j=0;j<primes.length;j++){
                if(temp==res[indexs[j]]*primes[j]){
                    indexs[j]++;
                }
            }
        }
        return res[n-1];
    }
}