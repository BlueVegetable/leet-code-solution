/**
 * 分隔链表
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * 你应当 保留 两个分区中每个节点的初始相对位置。
 */
public class LeetCode0086 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 两个链表，一个存小的，一个存大的，最后串起来
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode smallHead = small;
        ListNode large = new ListNode(0);
        ListNode largeHead = large;

        ListNode start = head;
        while(start != null) {
            if(start.val < x) {
                small.next = start;
                small = small.next;
            } else {
                large.next = start;
                large = large.next;
            }
            start = start.next;
        }
        small.next = largeHead.next;
        large.next = null;
        return smallHead.next;
    }
}