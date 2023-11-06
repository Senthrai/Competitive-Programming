/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foutoir.linkedlist;

/**
 *
 * @author senth
 */
public class LeetCodeLinkedListEasy {
    public static void main(String[] args){
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(4,node3);
        ListNode node1 = new ListNode(5,node2);
        
        Solution solution = new Solution();
        System.out.println(solution.middleNode(node1));
    }
}

class ListNode1 {

    int val;
    ListNode next;

    ListNode1() {
    }

    ListNode1(int val) {
        this.val = val;
    }

    ListNode1(int val,
            ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {

    int count = 0;
    int middle = 0;
    ListNode middleNode;

    public ListNode middleNode(ListNode head) {
        count++;
        if (head.next != null) {
            middleNode(head.next);
        } else {
            middle = count / 2 + 1;
        }
        for (int i = 0; i < middle; i++) {
            middleNode = goToMiddle(head);
        }
        return middleNode;
    }

    ListNode goToMiddle(ListNode node) {
        return node.next;
    }
}
