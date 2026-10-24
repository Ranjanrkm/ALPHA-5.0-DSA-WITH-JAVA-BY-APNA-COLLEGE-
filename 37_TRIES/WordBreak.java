

public class WordBreak {

    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;
    }

    public static Node root = new Node();

    // Insert a word into Trie
    public static void insert(String word) {
        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }

            curr = curr.children[idx];
        }

        curr.eow = true;
    }

    // Search a complete word in Trie
    public static boolean search(String key) {
        Node curr = root;

        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return curr.eow;
    }

    // Word Break
    public static boolean wordBreak(String key) {
        if (key.length() == 0) {
            return true;
        }

        for (int i = 1; i <= key.length(); i++) {
            if (search(key.substring(0, i))
                    && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String args[]) {
        String arr[] = {
            "i", "like", "sam", "samsung", "mobile", "ice"
        };

        for (int i = 0; i < arr.length; i++) {
            insert(arr[i]);
        }

        String key = "ilikesamsung";

        System.out.println(wordBreak(key));
    }
}
