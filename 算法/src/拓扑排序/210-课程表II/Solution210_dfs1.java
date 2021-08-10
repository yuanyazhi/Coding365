import java.util.ArrayList;
import java.util.List;

class Solution210_dfs1 {
    int index;
    int[] res;
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adjacency = new ArrayList<>();
        int[] visited = new int[numCourses]; // 0-未访问,1-正在访问,2-已访问
        res = new int[numCourses];
        index = numCourses-1;

        for(int i=0;i<numCourses;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int[] p : prerequisites){
            adjacency.get(p[1]).add(p[0]);
        }

        for(int i=0;i<numCourses;i++){
            if(dfs(i,adjacency,visited)) return new int[0];
        }
        return res;
    }

    public boolean dfs(int i, List<List<Integer>> adjacency, int[] visited){
        if(visited[i]==1) return true; // 正在访问，必定有环
        if(visited[i]==2) return false;// 已访问过，必定无环
        visited[i] = 1; // 正在访问
        for(int a : adjacency.get(i)){
            if(dfs(a,adjacency,visited)) return true;
        }
        res[index--] = i;
        visited[i] = 2; // 已访问过
        return false;
    }
}