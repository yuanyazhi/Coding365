// 给你一个整数 n ，请你找出并返回第 n 个 丑数 。
// 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
class Solution264 {
    public int nthUglyNumber(int n) {
        if(n==1) return 1;
        int[] primes = new int[]{2, 3, 5};
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