package Linked_List;

class ListNode<T> {
    T value;
    ListNode<T> next;
    
    ListNode(T value) {
        this.value = value;
        this.next = null;
    }
}

public class Middle_Of_Linked_List {
    public static void main(String[] args) {
        ListNode<Integer> head = new ListNode<>(1);
        head.next = new ListNode<>(2);
        head.next.next = new ListNode<>(3);
        head.next.next.next = new ListNode<>(4);
        head.next.next.next.next = new ListNode<>(5);
        
        ListNode<Integer> middle = middleNode(head);
        System.out.println("Middle node value: " + middle.value);
    }
    
    public static <T> ListNode<T> middleNode(ListNode<T> head) {
        ListNode<T> slow = head, fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}

