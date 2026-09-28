public class Solution {
    public ListNode detectCycle(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        
        if (fast == null || fast.next == null) {
            return null;
        }

        ListNode end = head;

        while (end != slow) {
            end = end.next;
            slow = slow.next;
        }

        return end;
    }
}