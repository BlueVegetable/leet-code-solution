import java.util.ArrayList;
import java.util.List;

/**
 * 回文链表
 * 给你一个单链表的头节点 head ，请你判断该链表是否为回文链表。如果是，返回 true ；否则，返回 false 。
 */
public class LeetCode0234 extends BaseLeetCode {
    public static void main(String[] args) {
        ;
    }

    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode current = head;
        while(current != null) {
            list.add(current.val);
            current = current.next;
        }
        if(list.size() == 0) {
            return true;
        }
        int start = 0, end = list.size() - 1;
        while(start <= end) {
            if(list.get(start).compareTo(list.get(end)) != 0) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}