// 自己写的算法,主要注意各种边界为空情况下的判断，73ms
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
         List<Integer> result = new ArrayList<>();
        boolean flag = false;
        ListNode node = l1;
        while (l1 != null || l2 != null) {
            int l1v = 0;
            int l2v = 0;
            if(l1 != null){
                l1v = l1.val;
            }
            if (l2!=null){
                l2v = l2.val;
            }
            int temp = l1v + l2v;
            
            if (flag == false) {
                if (temp<10){
                    flag = false;
                    result.add(temp);
                } else {
                    flag = true;
                    temp = temp - 10;
                    result.add(temp);
                }
            } else {
                temp = temp +1;
                if (temp<10){
                    flag = false;
                    result.add(temp);
                } else {
                    flag = true;
                    temp = temp - 10;
                    result.add(temp);
                }
            }
            
            if (l1 != null){
                 l1 = l1.next;
            }
           
            if (l2 != null){
                l2 = l2.next;
            }
            
        }
        
        
        if (flag==true){
            result.add(1);
            flag = false;
        }
        ListNode dummyRoot = new ListNode(0);
        ListNode ptr = dummyRoot;
        for(int item : result) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }
}
