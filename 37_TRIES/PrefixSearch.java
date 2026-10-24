

public class PrefixSearch {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    public static Node root = new Node();

    // Insert a word into the Trie
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
    public static boolean search(String word) {
        Node curr = root;

        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';

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

    public static void main(String[] args) {
        String[] words = {
            "the", "a", "there", "their", "any"
        };

        for (String word : words) {
            insert(word);
        }

        System.out.println(search("the"));
        System.out.println(search("there"));
        System.out.println(search("ther"));
        System.out.println(startsWith("the"));
        System.out.println(startsWith("ther"));
        System.out.println(startsWith("xyz"));
    }
}
