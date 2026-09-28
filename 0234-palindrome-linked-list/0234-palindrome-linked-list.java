class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow,fast,mid;
        slow=fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;
        ListNode first=head;
        ListNode second=reverse(mid);
        while(second!=null){
            if(first.val!=second.val)
            return false;
            first=first.next;
            second=second.next;
        }
        return true;
    }
    public ListNode reverse(ListNode head){
        ListNode prev,current,nextnode;
        prev=null;
        current=head;
        while(current!=null){
            nextnode=current.next;
            current.next=prev;
            prev=current;
            current=nextnode;
        }return prev;

    }
}