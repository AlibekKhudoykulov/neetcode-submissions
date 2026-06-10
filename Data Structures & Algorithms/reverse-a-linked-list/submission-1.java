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
    
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> values = new ArrayList<>();
        ListNode curr = head;
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }
        Collections.reverse(values);
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for (int val : values) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return dummy.next;
    }
}
