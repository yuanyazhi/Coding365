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
class Solution23_2 {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0) return null;
        return merge(lists,0,lists.length-1);
    }
    public ListNode merge(ListNode[] lists, int i, int j){
        if(i>=j) return lists[i];
        int mid = (j-i)/2+i;
        return mergeTwoLists(merge(lists,i,mid),merge(lists,mid+1,j));
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