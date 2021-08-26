import java.util.ArrayList;
import java.util.List;

class Solution083 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> permute(int[] nums) {
        boolean[] visited = new boolean[nums.length];
        dfs(nums, visited);
        return res;
    }
    public void dfs(int[] nums, boolean[] visited){
        if(list.size()==nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(visited[i]) continue;
            visited[i] = true;
            list.add(nums[i]);
            dfs(nums, visited);
            visited[i] = false;
            list.remove(list.size()-1);
        }
    }
}