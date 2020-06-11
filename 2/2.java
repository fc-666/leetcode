/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sum=new ListNode(0);
        ListNode curr=sum;
        int s1=0;
        while(l1!=null || l2!=null)
            {
                int c1=(l1!=null)?l1.val:0;
                int c2=(l2!=null)?l2.val:0;
                int s2=(c1+c2+s1)%10;
                s1=(c1+c2+s1)/10;
                ListNode sumnode=new ListNode(s2);
                curr.next=sumnode;
                curr=curr.next;
                if(l1!=null) l1=l1.next;
                if(l2!=null) l2=l2.next;
            }
        if(s1>0)
            curr.next=new ListNode(s1);
        return sum.next;
    }
}