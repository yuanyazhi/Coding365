public class Solution001 {
    public int divide(int a, int b) {
        int res = 0;
        if(b==1) return a;
        if(a==Integer.MIN_VALUE && b==-1) return Integer.MAX_VALUE;
        int flag = (a>0 && b>0) || (a<0 && b<0) ? 1 : -1;
        long aa = Math.abs((long)a);
        long bb = Math.abs((long)b);
        while(aa>=bb){
            int tmp_r = 1;
            long tmp_b = bb;
            while(tmp_b<<1 <= aa){
                tmp_b <<= 1;
                tmp_r <<= 1;
            }
            aa -= tmp_b;
            res += tmp_r;
        }
        return flag * res;
    }
}