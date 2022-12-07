/**
 * 判断链表中是否有环
 */
public class LeetCode0141 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    /**
     * 快慢指针方案
     * 进入环后，快指针会在慢指针前面
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        if(head == null || head.next == null) {
            return false;
        }
        boolean result = false;
        ListNode slow = head;
        ListNode fast = head.next;
        while(slow != fast) {
            if(fast == null || fast.next == null) {
                //快的到结尾了，不是环
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        //快的反而追上慢的
        return true;
    }
}