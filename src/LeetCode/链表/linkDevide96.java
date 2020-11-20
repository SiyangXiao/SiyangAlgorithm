package LeetCode.链表;

public class linkDevide96 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode partition(ListNode head, int x) {
        // write your code here
        if (head == null) return null;
        ListNode small = new ListNode(0);
        ListNode big = new ListNode(0);
        ListNode big0 = big, small0 = small;
        while(head != null){
            if (head.val < x){
                small0.next = head;
                small0 = head;
            }else{
                big0.next = head;
                big0 = head;
            }
            head = head.next;
        }
        big0.next = null;
        small0.next = big.next;
        System.out.println(big0 == big);
        return small.next;
    }

}
