import data_struct.ListNode;

/**
 * @author xiaoweii
 * @create 2026-03-08 10:22
 */
public class LeetCode_0021 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode pre = dummy;
        while (list1 != null && list2 != null) {
            if (list1.getVal() <= list2.getVal()) {
                pre.setNext(list1);
                list1 = list1.getNext();
            } else {
                pre.setNext(list2);
                list2 = list2.getNext();
            }
            pre = pre.getNext();
        }
        if (list1 != null) {
            pre.setNext(list1);
        }
        if (list2 != null) {
            pre.setNext(list2);
        }
        return dummy.getNext();
    }
}
