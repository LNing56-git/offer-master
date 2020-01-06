package com.LeetCode;

class TrieNode {

    private TrieNode[] childs;
    private int R = 26;
    private boolean isEnd = false;
    /** Initialize your data structure here. */
     TrieNode() {
        childs = new TrieNode[R];
    }
    
    boolean containsKey(char ch){
        return childs[ch-'a']!=null;
    }
    
    public TrieNode get(char ch){
        return  childs[ch-'a'];
    }
    
     void put(char ch,TrieNode TrieNode){
        childs[ch-'a']=TrieNode;
    }
   void setEnd(){
        isEnd = true;
    }
    public boolean isEnd(){
        return isEnd;
    }
    

}
public class Trie{
    private TrieNode root;

    public Trie(){
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode cur = root;
        for (int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if (!cur.containsKey(ch)){
                cur.put(ch,new TrieNode());
            }
            cur = cur.get(ch);
        }
        cur.setEnd();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode cur =root;
        for(int i= 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(!cur.containsKey(ch)){
                return false;
            }
            cur = cur.get(ch);
        }
        return cur.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode cur =root;
        for(int i= 0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            if(!cur.containsKey(ch)){
                return false;
            }
            cur = cur.get(ch);
        }
        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        System.out.println(trie.search("app"));
    }
}