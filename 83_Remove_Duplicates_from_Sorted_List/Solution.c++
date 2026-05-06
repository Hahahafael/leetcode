class Solution {
public:
    ListNode* deleteDuplicates(ListNode* head) {
        if (!head) return nullptr;
        ListNode* atual = head;
        while (atual->next != nullptr) {
            if (atual->val == atual->next->val) {
                ListNode* paraDeletar = atual->next;
                atual->next = atual->next->next;
                delete paraDeletar;
            } else {
                atual = atual->next;
            }
        }

        return head;
    }
};