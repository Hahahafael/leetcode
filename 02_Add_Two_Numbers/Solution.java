class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return somarComCarry(l1, l2, 0);
    }

    private ListNode somarComCarry(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }
        int val1 = (l1 != null) ? l1.val : 0;
        int val2 = (l2 != null) ? l2.val : 0;
        int somaTotal = val1 + val2 + carry;
        int novoCarry = somaTotal / 10;
        ListNode resultado = new ListNode(somaTotal % 10);
        ListNode proximoL1 = (l1 != null) ? l1.next : null;
        ListNode proximoL2 = (l2 != null) ? l2.next : null;
        resultado.next = somarComCarry(proximoL1, proximoL2, novoCarry);
        return resultado;
    }
}