

public class StartsWith {

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

    // Search for a complete word
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

    // Check whether a prefix exists
    public static boolean startsWith(String prefix) {
        Node curr = root;

        for (int level = 0; level < prefix.length(); level++) {
            int idx = prefix.charAt(level) - 'a';

            if (curr.children[idx] == null) {
                return false;
            }

            curr = curr.children[idx];
        }

        return true;
    }

    public static void main(String args[]) {
        String words[] = {
            "apple", "app", "mango", "man", "woman"
        };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        String prefix1 = "app";
        String prefix2 = "moon";

        System.out.println(startsWith(prefix1));
        System.out.println(startsWith(prefix2));
    }
}
