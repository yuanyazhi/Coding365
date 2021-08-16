class Solution72 {
    public int minDistance(String word1, String word2) {
        int m = word1.length(), n = word2.length();
        int[][] dist = new int[m+1][n+1];
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0){
                    dist[i][j] = j;
                }else if(j==0){
                    dist[i][j] = i;
                }else{
                    if(word1.charAt(i-1)==word2.charAt(j-1)){
                        dist[i][j] = dist[i-1][j-1];
                    }else{
                        // min(插入一个字符 删除一个字符 替换一个字符)
                        dist[i][j] = Math.min(dist[i-1][j-1], Math.min(dist[i][j-1],dist[i-1][j]))+1;
                    }
                }
            }
        }
        return dist[m][n];
    }
}