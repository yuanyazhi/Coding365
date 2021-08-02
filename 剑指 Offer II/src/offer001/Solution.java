package offer001;

public class Solution {
    public int divide(int a, int b) {
        if(a==Integer.MIN_VALUE && b==-1) return Integer.MAX_VALUE;
        if(a==Integer.MIN_VALUE && b==1) return Integer.MIN_VALUE;
        int flag = (a>0 && b>0) || (a<0 && b<0) ? 1 : -1;
        long aa = Math.abs((long)a);
        long bb = Math.abs((long)b);
        int res = 0;
        while(aa>=bb){
            int cur = 1;
            long tmp = bb;
            // 指数递增b的值
            while(tmp<<1 <= aa){
                tmp <<= 1;
                cur <<= 1;
            }
            res += cur;
            // 剩余值继续算
            aa -= tmp;
        }
        return flag * res;
    }
}

// 递归：栈溢出
// -2147483648 -1
//
//public class Solution {
//    int a = 0, b = 0;
//    public int divide(int a, int b) {
//        this.a = a;
//        this.b = b;
//        int flag = (a>0 && b>0) || (a<0 && b<0) ? 1 : -1;
//        return flag*cal(-Math.abs(a),-Math.abs(b));
//    }
//    public int cal(int a, int b){
//        if(a>b) return 0;
//        else return cal(a-b,b)+1;
//    }
//}
