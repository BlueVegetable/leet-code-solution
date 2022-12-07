/**
 * 合并两个有序链表
 */
public class LeetCode0021 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 递归算法进行合并
     * 找到当前比较小的节点，然后这个节点的下一个节点指向下一个合并算法的返回值
     * @param list1
     * @param list2
     * @return
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) {
            return list2;
        }
        if(list2 == null) {
            return list1;
        }
        if(list1.val < list2.val) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list2.next, list1);
            return list2;
        }
    }
}