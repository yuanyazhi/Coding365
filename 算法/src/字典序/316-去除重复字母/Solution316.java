import java.util.Deque;
import java.util.LinkedList;

class Solution316 {
    // 贪心 + 单调栈
    // 如果已经入栈，当前的这个就不要了
    // 如果未入栈，就看看前面的有什么能删的：比当前值大，且不是独苗儿
    public String removeDuplicateLetters(String s) {
        int[] nums = new int[26];
        boolean[] vis = new boolean[26];
        for(char c:s.toCharArray()){
            nums[c-'a']++;
        }
        Deque<Character> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(char c:s.toCharArray()){
            if(vis[c-'a']){
                nums[c-'a']--;
                continue;
            }
            while(!deque.isEmpty() && deque.peekLast()>c && nums[deque.peekLast()-'a']>1){
                char t = deque.pollLast();
                nums[t-'a']--;
                vis[t-'a'] = false;
            }
            deque.offerLast(c);
            vis[c-'a'] = true;
        }
        while(!deque.isEmpty()){
            sb.append(deque.pollFirst());
        }
        return sb.toString();
    }
}