import java.util.ArrayList;
import java.util.List;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }

    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        List<Integer> numbers = new ArrayList<>();
        ListNode listNode = this;
        while(listNode != null) {
            numbers.add(listNode.val);
            listNode = listNode.next;
        }
        if(numbers.size() == 0) {
            return "0";
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i=numbers.size()-1;i>=0;i--) {
                stringBuffer.append(numbers.get(i));
            }
            return stringBuffer.toString();
        }
    }
}