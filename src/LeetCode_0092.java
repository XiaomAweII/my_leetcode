import data_struct.ListNode;

/**
 * @author xiaoweii
 * @create 2026-03-08 10:55
 */
public class LeetCode_0092 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.setNext(head);
        ListNode pre = dummy;
        ListNode cur = head;
        // 待翻转左区间
        for (int i = 0; i < left - 1; i++) {
            pre = pre.getNext();
            cur = cur.getNext();
        }
        // 不断使用头插法将cur节点下一个节点插入，直到cur节点到达右边界
        for (int i = 0; i < right - left; i++) {
            ListNode temp = cur.getNext();
            cur.setNext(temp.getNext());
            temp.setNext(pre.getNext());
            pre.setNext(temp);
        }
        return dummy.getNext();
    }
}
