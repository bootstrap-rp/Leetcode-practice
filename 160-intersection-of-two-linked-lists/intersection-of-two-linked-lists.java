/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr1=headA;
        ListNode ptr2=headB;

        while(ptr1!=ptr2){
            ptr1=(ptr1!=null)?ptr1.next:headB;
            ptr2=(ptr2!=null)?ptr2.next:headA;
        }
        return ptr1;
    }
}