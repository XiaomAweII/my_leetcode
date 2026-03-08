import data_struct.ListNode;

/**
 * @author xiaoweii
 * @create 2026-03-07 10:42
 */
public class LeetCode_0203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.setNext(head);

        ListNode pre = dummy;
        ListNode cur = head;

        while (cur != null) {
            if (cur.getVal() == val) {
                pre.setNext(cur.getNext());
            } else {
                pre = cur;
            }
            cur = cur.getNext();
        }

        return dummy.getNext();
    }
}
