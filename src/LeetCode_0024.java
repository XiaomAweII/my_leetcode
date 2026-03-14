/**
 * @author xiaoweii
 * @create 2026-03-07 10:49
 */
public class LeetCode_0024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode subHead = swapPairs(head.next.next);
        ListNode headNext = head.next;
        headNext.next = head;
        head.next = subHead;
        return headNext;
    }
}
