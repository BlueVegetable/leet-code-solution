import java.util.ArrayList;
import java.util.List;

public class LeetCode0002 extends BaseLeetCode  {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        if (l1==null&&l2==null) {
            return result;
        } else if(l1!=null&&l2==null) {
            return addNumbers(l1,l2);
        } else {
            return addNumbers(l2,l1);
        }
    }
    private ListNode addNumbers(ListNode l1,ListNode l2) {
        boolean begin = true;
        ListNode result = new ListNode(0);
        ListNode next = result;
        if(l2 == null) {
            return l1;
        }
        int jinLv = 0;
        while(l1!=null||l2!=null||jinLv!=0) {
            int sum = 0;
            if(l1!=null&&l2!=null) {
                sum = l1.val+l2.val + jinLv;
                l1 = l1.next;
                l2 = l2.next;
            } else if(l1!=null&&l2==null) {
                sum = l1.val + jinLv;
                l1 = l1.next;
            } else if(l1==null&&l2!=null) {
                sum = l2.val + jinLv;
                l2 = l2.next;
            } else if(l1==null&&l2==null&&jinLv!=0) {
                sum = jinLv;
            }
            if(sum >= 10) {
                jinLv = 1;
                sum = sum - 10;
            } else {
                jinLv = 0;
            }
            ListNode wei = new ListNode(sum);
            if(begin) {
                result = wei;
                next = result;
                begin = false;
            } else {
                next.next = wei;
                next = next.next;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(5);
//        listNode1.next = new ListNode(8);
//        listNode1.next.next = new ListNode(3);
//        ListNode listNode2 = new ListNode(0);
        ListNode listNode2 = new ListNode(5);
//        listNode2.next = new ListNode(6);
//        listNode2.next.next = new ListNode(4);
        System.out.println(new LeetCode0002().addTwoNumbers(listNode1,listNode2));
    }
}