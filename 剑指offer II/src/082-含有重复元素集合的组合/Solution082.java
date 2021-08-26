import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 给定一个可能有重复数字的整数数组candidates和一个目标数target
// 找出candidates中所有可以使数字和为target的组合。
// candidates中的每个数字在每个组合中只能使用一次，解集不能包含重复的组合。

class Solution082 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        dfs(candidates, 0, target);
        return res;
    }
    public void dfs(int[] candidates, int cur, int target){
        if(target==0){
            res.add(new ArrayList<>(list));
            return;
        }
        for(int i=cur;i<candidates.length;i++){
            if(target<0) continue;
            if(i>cur && candidates[i]==candidates[i-1]) continue;
            list.add(candidates[i]);
            dfs(candidates, i+1, target-candidates[i]);
            list.remove(list.size()-1);
        }
    }
}