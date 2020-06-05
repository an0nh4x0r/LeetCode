package in.swapnilsingh;

import java.util.Collections;

public class AddTwoNumbers {
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();

        while(true) {
            s1.append(l1.val);
            if (l1.next != null) {
                l1 = l1.next;
            } else {
                break;
            }
        }

        while (true) {
            s2.append(l2.val);
            if (l2.next != null) {
                l2 = l2.next;
            } else {
                break;
            }
        }

        Integer i1 = Integer.parseInt(s1.reverse().toString());
        Integer i2 = Integer.parseInt(s2.reverse().toString());

        Integer result = i1 + i2;
        String resultString = reverseString(String.valueOf(result));

        ListNode resultNode = new ListNode(resultString.charAt(0));
        ListNode finalResultNode = resultNode;

        for (int i = 1; i < resultString.length(); ++i) {
            ListNode node = new ListNode(resultString.charAt(i));
            resultNode.next = node;
            resultNode = node;
        }

        return finalResultNode;
    }

    private static String reverseString(String s) {
        StringBuilder stringBuilder = new StringBuilder(s);
        return stringBuilder.reverse().toString();
    }
}