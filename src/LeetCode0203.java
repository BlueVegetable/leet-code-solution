/**
 * 移除链表元素
 */
public class LeetCode0203 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 递归方式处理
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {
        if(head != null) {
            if(head.val != val) {
                head.next = removeElements(head.next, val);
                return head;
            } else {
                return removeElements(head.next, val);
            }
        }
        return null;
    }
}