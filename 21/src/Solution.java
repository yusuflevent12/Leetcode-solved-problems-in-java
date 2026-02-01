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
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null||list2==null){
            return null;
        }
        ListNode current1=list1;
        ListNode current2=list2;
        ListNode node=null;
        ListNode head=null;
        if(current1.val>current2.val){
            node=current1;
            current1=current1.next;
        }else{
            node=current2;
            current2=current2.next;
        }
        node.next=head;
        while(current2.next!=null&&current1.next!=null){
            if(current1.val>current2.val){
                head=current1;
                current1=current1.next;
            }else{
                head=current2;
                current2=current2.next;
            }
            head=head.next;
        }
        return node;
    }
}