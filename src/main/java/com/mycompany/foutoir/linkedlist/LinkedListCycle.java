package com.mycompany.foutoir.linkedlist;

import java.util.HashMap;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            // If the list is empty or has only one node, there can be no cycle.
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;         // Move the slow pointer one step
            fast = fast.next.next;    // Move the fast pointer two steps

            if (slow == fast) {
                // If the fast pointer catches up with the slow pointer, there is a cycle.
                return true;
            }
        }

        // If the fast pointer reaches the end of the list, there is no cycle.
        return false;
    }
}







