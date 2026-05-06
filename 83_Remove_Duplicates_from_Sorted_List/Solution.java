class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null){
            return null;
        }
        ListNode atual = head;
        while (atual.next != null) {
            if (atual.val == atual.next.val) {
                atual.next = atual.next.next;
            } else {
                atual = atual.next;
            }
        }
        return head;
    }
}