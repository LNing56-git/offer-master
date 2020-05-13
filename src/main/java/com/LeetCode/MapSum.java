package com.LeetCode;
class TrieNode1{
    TrieNode1[] childs = new TrieNode1[26];
    int value =0;
}
public class MapSum {
    private TrieNode1 root;
    /** Initialize your data structure here. */
    public MapSum() {
        root = new TrieNode1();
    }

    public void insert(String key, int val) {
        TrieNode1 cur = root;
        for (int i=0;i<key.length();i++){
            char ch = key.charAt(i);
            if (cur.childs[ch-'a']==null){
                cur.childs[ch-'a']=new TrieNode1();
            }
            cur = cur.childs[ch-'a'];
        }
         cur.value = val;
    }

    public int sum(String prefix) {
        TrieNode1 cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (cur.childs[ch - 'a'] == null) {
                return 0;
            }
            cur  = cur.childs[ch-'a'];
        }
        return sum(cur);
    }
    public int sum(TrieNode1 trieNode1) {
        if (trieNode1==null){
            return 0;
        }
        int sum = trieNode1.value;
        for (TrieNode1 temp:trieNode1.childs){
            sum+= sum(temp);
        }
        return sum;
    }
}
