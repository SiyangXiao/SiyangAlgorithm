package LeetCode.链表;

/**
 * 翻转链表中第m个节点到第n个节点的部分
 */
public class reverseLinkII36 {
    //Definition for ListNode
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        head = dummy;//head-1-2-3-4-5-6-N
        for (int i = 1 ;i < m; i++){
            head = head.next;//if m element is 2, now head is 1.
        }
        ListNode premNode = head;//if m element is 2, now head is 1.
        ListNode mNode = head.next;
        ListNode nNode = head.next;
        ListNode postnNode = head.next.next;//mNode.next
        for (int i = m; i < n; i++){//reverse nNode and postnNode
            ListNode temp = postnNode.next;
            postnNode.next = nNode;
            nNode = postnNode;
            postnNode = temp;
        }
        premNode.next = nNode;
        mNode.next = postnNode;
        return dummy.next;
    }
}
