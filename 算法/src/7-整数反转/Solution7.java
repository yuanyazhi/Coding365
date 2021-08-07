class Solution7 {
    public int reverse(int x) {
        int res = 0; // 不存储long
        while(x!=0){
            int tmp = res*10 + x%10;
            // 判断是否溢出，计算结果是否正确，不正确则返回0
            if(tmp/10 != res){
                return 0;
            }
            res = tmp;
            x/=10;
        }
        return res;
    }
}