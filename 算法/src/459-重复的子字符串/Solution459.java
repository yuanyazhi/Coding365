class Solution459 {
    // 暴力枚举
    public boolean repeatedSubstringPattern1(String s) {
        int n = s.length();
        for(int i=1;i<=n/2;i++){
            if(n%i!=0) continue;
            boolean match = true;
            for(int j=i;j<n;j++){
                if(s.charAt(j-i)!=s.charAt(j)){
                    match = false;
                    break;
                }
            }
            if(match) return true;
        }
        return false;
    }
    // 旋转，查找
    public boolean repeatedSubstringPattern2(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }
    // kmp 算法

}