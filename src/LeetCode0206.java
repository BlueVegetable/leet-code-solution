/**
 * 反转链表
 */
public class LeetCode0206 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    public ListNode reverseList(ListNode head) {
        ListNode result = head;
        ListNode node1 = head;
        ListNode node2 = null;
        if(node1 != null) {
            //设置下一个节点
            node2 = node1.next;
            //头结点不为空，设置头结点的下一个为空，避免循环
            head.next = null;
        }
        while(node1 != null && node2 != null) {
            result = node2;
            ListNode node3 = node2.next;
            node2.next = node1;
            node1 = node2;
            node2 = node3;
        }
        return result;
    }
}