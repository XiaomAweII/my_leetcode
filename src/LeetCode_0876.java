import data_struct.ListNode;

/**
 * @author xiaoweii
 * @create 2026-03-08 10:46
 */
public class LeetCode_0876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }
}
