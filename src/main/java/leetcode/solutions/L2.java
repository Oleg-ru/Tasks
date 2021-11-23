package leetcode.solutions;

/*
    2. Add Two Numbers
You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order,
and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
public class L2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return new ListNode();
    }

    public static void main(String[] args) {

    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) {
        this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
            }
    }

}
