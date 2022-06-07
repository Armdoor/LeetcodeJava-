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
    public ListNode swapPairs(ListNode head) 
    {
         ListNode curr = head;
        ListNode prev= null ;
        while (curr!=null && curr.next!=null)
        {
            ListNode first_node = curr.next;
            if (curr==head)
                head=curr.next;
            curr.next= first_node.next;
            first_node.next=curr;
            if (prev!=null)
                prev.next=first_node;
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
}