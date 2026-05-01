class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        if (strs.empty()) return "";
        string prefixo = strs[0];
        for (int i = 1; i < strs.size(); i++) {
            while (strs[i].find(prefixo) != 0) {
                prefixo.pop_back();
                if (prefixo.empty()) return "";
            }
        }
        return prefixo;
    }
};