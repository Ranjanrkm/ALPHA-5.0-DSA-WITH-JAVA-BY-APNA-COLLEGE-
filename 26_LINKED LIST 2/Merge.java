//Node class
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

//LinkedList class
class LinkedList {
    Node head;

    // Add element to the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void print() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

// Merge Sort Implementation (Extending LinkedList)
public class Merge extends LinkedList{

   // Merged two sorted linked lists
    private Node merge(Node head1,Node head2) {
        Node mergedLL = new Node(-1); // dummy node
        Node temp = mergedLL;

        while(head1 != null && head2 != null) {
            if(head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }
    public Node mergeSort(Node head) {
        if(head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid(head);
        // left and right MS 
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }
    public static void main(String[] args) {
        Merge ll = new Merge();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
    
        //5 ->4->3->2->1
        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();
    }
}