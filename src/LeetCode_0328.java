/**
 * @author xiaoweii
 * @create 2026-03-08 10:38
 */
public class LeetCode_0328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // 记录奇数
        ListNode odd = head;
        // 记录偶数
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;

            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
