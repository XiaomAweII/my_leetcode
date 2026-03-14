/**
 * @author xiaoweii
 * @create 2026-03-08 10:55
 */
public class LeetCode_0092 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pre = dummy;
        ListNode cur = head;
        // 待翻转左区间
        for (int i = 0; i < left - 1; i++) {
            pre = pre.next;
            cur = cur.next;
        }
        // 不断使用头插法将cur节点下一个节点插入，直到cur节点到达右边界
        for (int i = 0; i < right - left; i++) {
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        return dummy.next;
    }
}
