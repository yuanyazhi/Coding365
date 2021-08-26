import java.util.Deque;
import java.util.LinkedList;

class Solution402 {
    // 贪心 + 单调栈
    // 每次都移掉比下一个数字大的第一个数字（只要比下一个数字大，就移掉）
    public String removeKdigits(String num, int k) {
        Deque<Character> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<num.length();i++){
            while(k>0 && !deque.isEmpty() && (char)deque.peekLast()>(char)num.charAt(i)){
                deque.pollLast();
                k--;
            }
            deque.offerLast(num.charAt(i));
        }
        while(k>0){
            deque.pollLast();
            k--;
        }
        while(!deque.isEmpty() && deque.peekFirst()=='0'){
            deque.pollFirst();
        }
        while(!deque.isEmpty()){
            sb.append((char)deque.pollFirst());
        }
        return sb.length()==0 ? "0":sb.toString();
    }
}