/**
 * @author xiaoweii
 * @create 2026-03-08 10:46
 */
public class LeetCode_0876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
