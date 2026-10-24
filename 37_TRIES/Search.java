
public class Search {

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

    public static void main(String args[]) {
        String words[] = {"the", "a", "there", "their", "any", "thee"};

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        System.out.println(search("any"));
        System.out.println(search("an"));
        System.out.println(search("there"));
        System.out.println(search("xyz"));
    }
}
