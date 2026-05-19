class Solution {
    public ListNode reverseList(ListNode head) {
        return reverter(head, null);
    }
    
    private ListNode reverter(ListNode atual, ListNode anterior) {
        if (atual == null) {
            return anterior;
        }
        ListNode proximoNo = atual.next; 
        atual.next = anterior;      
        return reverter(proximoNo, atual);
    }
}