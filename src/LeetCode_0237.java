/**
 * @author xiaoweii
 * @create 2026-03-08 10:33
 */
public class LeetCode_0237 {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
