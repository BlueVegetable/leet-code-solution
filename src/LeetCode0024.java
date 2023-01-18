/**
 * 两两交换链表中的节点
 * 给你一个链表，两两交换其中相邻的节点，并返回交换后链表的头节点。你必须在不修改节点内部的值的情况下完成本题（即，只能进行节点交换）。
 */
public class LeetCode0024 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 三个指针处理
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        //后退一步
        ListNode before = new ListNode(0,head);

        //设置三个指针
        ListNode temp = before;
        while(temp.next != null && temp.next.next != null) {
            //如果后面有两个元素，处理
            ListNode node1 = temp.next;
            ListNode node2 = node1.next;

            //开始进行交换
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;

            //交换完成，跳到下一组
            temp = node1;
        }
        return before.next;
    }

}