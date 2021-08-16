/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution23_1 {
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode ans = null;
        for(int i=0;i<lists.length;i++){
            ans = mergeTwoLists(ans, lists[i]);
        }
        return ans;
    }
    public ListNode mergeTwoLists(ListNode a, ListNode b){
        if(a==null || b==null) return a==null ? b : a;
        ListNode pre = new ListNode(0);
        ListNode cur = pre, aa = a, bb = b;
        while(aa!=null && bb!=null){
            if(aa.val<bb.val){
                cur.next = aa;
                aa = aa.next;
            }else{
                cur.next = bb;
                bb = bb.next;
            }
            cur = cur.next;
        }
        cur.next = aa==null ? bb : aa;
        return pre.next;
    }
}