package com.damon.algorithm.graph;

public class Trie_Hot100_208 {

    private Trie_Hot100_208[] children;
    private boolean isEnd;

    public Trie_Hot100_208() {
        this.children = new Trie_Hot100_208[26];
        this.isEnd = false;
    }

    public void insert(String word) {
        Trie_Hot100_208 node = this;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new Trie_Hot100_208();
            }
            node = node.children[index];
        }
        node.isEnd = true;
    }

    public boolean search(String word) {
        Trie_Hot100_208 node = searchPrefix(word);
        return node != null && node.isEnd;
    }

    public boolean startsWith(String prefix) {
        return searchPrefix(prefix) != null;
    }

    private Trie_Hot100_208 searchPrefix(String prefix) {
        Trie_Hot100_208 node = this;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            int index = ch - 'a';
            if (node.children[index] == null) {
                return null;
            }
            node = node.children[index];
        }
        return node;
    }

}
