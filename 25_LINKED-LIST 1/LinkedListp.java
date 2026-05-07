
public class LinkedListp {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add at first
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // add at last
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add at specific index
    public void add(int idx , int data) {
        if(idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while(i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void print() {
        if(head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }


        // slow-fast approach
        public Node findMid(Node head) { //helper
            Node slow = head;
            Node fast = head;

            while(fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow; //slow is my midNode
        }

        public boolean checkPalindrome() {
            if(head == null || head.next == null) {
                return true;
            }
            //step1 - find mid
            Node midNode = findMid(head);

            // step 2 - reverse 2nd half
            Node prev = null;
            Node curr = midNode;
            Node next;
            while(curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            Node right = prev; //right half head
            Node left = head;

            //step3 - check left half & right half
            while(right != null) {
                if(left.data != right.data) {
                    return false;
                }
                left = left.next;
                right = right.next;
            }

            return true;
        }

 
    public static void main(String[] args) {
        LinkedListp ll = new LinkedListp();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        

        ll.print();
        System.out.println(ll.checkPalindrome());

    }
}