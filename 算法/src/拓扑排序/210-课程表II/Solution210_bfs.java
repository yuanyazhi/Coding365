import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

class Solution210_bfs {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // bfs
        // 邻接矩阵，入度数组，访问队列，访问结果
        List<List<Integer>> adjacency = new ArrayList<>();
        int indeg[] = new int[numCourses];
        Deque<Integer> deque = new LinkedList<>();
        int[] res = new int[numCourses];
        int index = 0;

        // 构建邻接矩阵，填充入度数组
        for(int i=0;i<numCourses;i++){
            adjacency.add(new ArrayList<>());
        }
        for(int[] p : prerequisites){
            adjacency.get(p[1]).add(p[0]);
            indeg[p[0]]++;
        }

        // BFS遍历：入度为0的节点入队
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                deque.offerLast(i);
            }
        }
        while(!deque.isEmpty()){
            int c = deque.pollFirst();
            res[index++] = c;
            for(int a : adjacency.get(c)){
                indeg[a]--;
                if(indeg[a]==0){
                    deque.offerLast(a);
                }
            }
        }

        return index==numCourses ? res : new int[0];
    }
}