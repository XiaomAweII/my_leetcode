import data_struct.ListNode;

/**
 * @author xiaoweii
 * @create 2026-03-07 10:49
 */
public class LeetCode_0024 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        ListNode subHead = swapPairs(head.getNext().getNext());
        ListNode headNext = head.getNext();
        headNext.setNext(head);
        head.setNext(subHead);
        return headNext;
    }
}
