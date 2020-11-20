package LeetCode.链表;

public class twonumTime756 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public long multiplyLists(ListNode l1, ListNode l2) {
        // write your code here
        long num1 = 0;
        long num2 = 0;
        while(l1 != null){
            num1 = num1 * 10 + l1.val;
            l1 = l1.next;
        }
        while(l2 != null){
            num2 = num2 * 10 + l2.val;
            l2 = l2.next;
        }
        return num1 * num2;
    }
}
