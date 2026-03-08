import data_struct.ListNode;

/**
 * @author xiaoweii
 * @create 2026-03-08 10:38
 */
public class LeetCode_0328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.getNext() == null) {
            return head;
        }
        // 记录奇数
        ListNode odd = head;
        // 记录偶数
        ListNode even = head.getNext();
        ListNode evenHead = even;
        while (even != null && even.getNext() != null) {
            odd.setNext(even.getNext());
            odd = odd.getNext();

            even.setNext(odd.getNext());
            even = even.getNext();
        }
        odd.setNext(evenHead);
        return head;
    }
}
