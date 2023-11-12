class TrieNode{
    protected Map<Character, TrieNode> children = new HashMap<>();
    protected boolean endOfWord = false;
}
class Trie {
    
    private TrieNode root;
    
    public Trie() {
        this.root = new TrieNode();
    }
    
    public void insert(String word) {
        TrieNode cur = this.root;
        
        for (char c : word.toCharArray()){
            if (!cur.children.containsKey(c)){
                cur.children.put(c, new TrieNode());
            }
            
            cur = cur.children.get(c);
        }
        
        cur.endOfWord = true;
    }
    
    public boolean search(String word) {
        TrieNode cur = this.root;
        
        for (char c : word.toCharArray()){
            if (!cur.children.containsKey(c)){
                return false;
            }
            
            cur = cur.children.get(c);
        }
        
        return cur.endOfWord;
    }
    
    public boolean startsWith(String prefix) {
        TrieNode cur = this.root;
        
        for (char c : prefix.toCharArray()){
            if (!cur.children.containsKey(c)){
                return false;
            }
            cur = cur.children.get(c);
        }
        
        return true;
        
    }
}

/*
    T:  
        insert() => O(n)
        search() => O(n)  
        startsWith() = O(n)
    S: O(n*k)    
*/

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */