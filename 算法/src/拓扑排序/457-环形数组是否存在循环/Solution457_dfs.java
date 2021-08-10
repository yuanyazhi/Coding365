class Solution457_dfs {
    // DFS: 递归 判断有向图是否有环（2个方向都要判断）
    public boolean circularArrayLoop(int[] nums) {
        int n = nums.length;
        if(n<=1) return false;
        int[] adjacency1 = new int[n];
        int[] adjacency2 = new int[n];
        int[] visited1 = new int[n];
        int[] visited2 = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                adjacency1[i] = ((i+nums[i]) % n + n) % n;
                adjacency2[i] = -1;
            }else{
                adjacency2[i] = ((i+nums[i]) % n + n) % n;
                adjacency1[i] = -1;
            }
        }
        for(int i=0;i<n;i++){
            if(dfs(i, adjacency1, visited1) || dfs(i, adjacency2, visited2)) return true;
        }
        return false;
    }
    public boolean dfs(int i, int[] adjacency, int[] visited){
        if(visited[i]==1) return true;
        if(visited[i]==2 || adjacency[i]==-1) return false;
        if(adjacency[i] == i) return false;
        visited[i] = 1;
        if(dfs(adjacency[i], adjacency, visited)) return true;
        visited[i] = 2;
        return false;
    }
}