import data_struct.ListNode;

/**
 * @author xiaoweii
 * @create 2026-03-07 10:00
 */
public class LeetCode_0019 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.setNext(head);
        // 要删除的当前节点
        ListNode cur = head;
        // 因为要删除，所以要记录其前一个节点
        ListNode latter = dummy;
        // 先让其向前走n次，用以与当前节点保持距离
        ListNode former = head;
        for (int i = 0; i < n; i++) {
            former = former.getNext();
        }
        while (former != null) {
            former = former.getNext();
            latter = cur;
            cur = cur.getNext();
        }
        assert cur != null;
        latter.setNext(cur.getNext());
        return dummy.getNext();
    }
}
