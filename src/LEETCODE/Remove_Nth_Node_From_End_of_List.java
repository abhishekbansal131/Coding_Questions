package LEETCODE;


//  Definition for singly-linked list.
 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution123 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        int c=0;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        ListNode temp2 = head;
        if(head.next == null) head = null;
        else if(c==n) head = head.next;
        else{
            for(int i=0; i<c-n-1; i++){
                temp2 = temp2.next;
            }
            temp2.next = temp2.next.next;
        }
        return head;
    }
}