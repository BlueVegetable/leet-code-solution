/**
 * 删除链表的倒数第 N 个结点
 */
public class LeetCode0019 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 双指针处理问题
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //先创建个后退的空间
        ListNode temp = new ListNode(0,head);
        ListNode right = head;

        //左指针后退一步
        ListNode left = temp;

        //右指针前进n格
        for (int i=0;i<n;i++) {
            right = right.next;
        }

        while(right != null) {
            //左右指针开始前进
            left = left.next;
            right = right.next;
        }
        //前进结束
        left.next = left.next.next;
        return temp.next;
    }
}