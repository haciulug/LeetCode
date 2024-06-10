package com.haciulug;

public class Q2 {
}

class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            current = current.next;
        }
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public static ListNode deserialize(String s) {
        String[] parts = s.split(",");
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (String part : parts) {
            part = part.replace("[", "").replace("]", "").trim();
            current.next = new ListNode(Integer.parseInt(part));
            current = current.next;
        }
        return dummy.next;
    }
}
