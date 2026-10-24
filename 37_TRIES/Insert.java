

public class Insert {

    static class Node {
        Node[] children = new Node[26];
        boolean eow = false;
    }

    public static Node root = new Node();

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

    public static void main(String[] args) {
        insert("cat");
        insert("car");

        System.out.println("Trie words inserted successfully!");
        System.out.println(root.children['c' - 'a'] != null);
    }
}
