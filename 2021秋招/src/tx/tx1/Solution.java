package tx.tx1;
import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param m int整型
     * @param a ListNode类 指向彩带的起点，val表示当前节点的val，next指向下一个节点
     * @return ListNode类一维数组
     */
    public ListNode[] solve (int m, ListNode a) {
        // write code here
        ListNode[] res = new ListNode[m];
        ListNode[] last = new ListNode[m];
        while(a!=null){
            ListNode temp = a.next;
            a.next = null;
            int mod = a.val%m;
            if(res[mod]==null){
                res[mod] = a;
                last[mod] = a;
            }else{
                last[mod].next = a;
                last[mod] = last[mod].next;
            }
            a = temp;
        }
        return res;
    }
}