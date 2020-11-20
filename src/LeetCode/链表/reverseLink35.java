package LeetCode.链表;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 翻转一个链表
 */
public class reverseLink35 {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(3);
        a.add(2);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);
        System.out.println();
        System.out.println(2%3);
        System.out.println();
    }


      //Definition for ListNode
      public class ListNode {
          int val;
          ListNode next;
          ListNode(int x) {
              val = x;
              next = null;
          }
      }

    public ListNode reverse(ListNode head) {
        //prev表示前继节点
        ListNode prev = null;//prev point to the last position of ListNode
        while (head != null) {
            //temp记录下一个节点，head是当前节点
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

}
