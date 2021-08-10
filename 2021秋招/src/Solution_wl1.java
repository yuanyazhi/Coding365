// 蔚来笔试：可见山峰对数量
public class Solution_wl1 {
    /**
     *
     * @param arr int整型二维数组 the array
     * @return int整型一维数组
     */
    public int[] findit (int[][] arr) {
        // write code here
        int[] res = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int n = arr[i][0];
            if(n<=1) res[i] = 0;
            else{
                res[i] = 2 * n - 3;
            }
        }
        return res;
    }
}