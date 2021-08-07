class Solution092_2 {
    public int minFlipsMonoIncr(String s) {
        // one: 1的个数（即把1变成0需要翻转的次数）
        // zero: 把0变成1最少需要翻转的次数
        int one = 0, zero = 0;
        for(char c : s.toCharArray()){
            zero = Math.min(zero, one);
            if(c=='0'){
                zero++;
            }else{
                one++;
            }
        }
        return Math.min(zero, one);
    }
}