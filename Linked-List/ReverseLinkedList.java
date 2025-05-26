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

//iterative
// class Solution {
//     public ListNode reverseList(ListNode head) {
//         ListNode curr = head;
//         ListNode prev = null;
//         while(curr != null){
//             ListNode temp = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = temp;    
//         }
//         return prev;
        
//     }
// }

//recursive
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode newHead = head;
        if(head.next != null){
            newHead = reverseList(head.next);
            head.next.next = head;
        };
        head.next = null;
        return newHead;

    }
}
