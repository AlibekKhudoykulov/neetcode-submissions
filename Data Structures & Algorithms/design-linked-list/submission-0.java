class MyLinkedList {
    ListNode head;
    ListNode tail;

    public MyLinkedList() {
        this.head = new ListNode(0);
        this.tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {
        int i = 0;
        ListNode curr = head.next;
        while (curr != null) {
            if (index == i) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head.next;
        newNode.prev = head;

        head.next.prev = newNode;
        head.next = newNode;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = tail;
        newNode.prev = tail.prev;

        tail.prev.next = newNode;
        tail.prev = newNode;
    }

    public void addAtIndex(int index, int val) {
        ListNode newNode = new ListNode(val);
        ListNode curr = head.next;
        int i = 0;
        while (curr != null) {
            if (index == i) {
                ListNode next = curr;
                ListNode prev = curr.prev;
                prev.next = newNode;
                next.prev = newNode;
                newNode.next = next;
                newNode.prev = prev;
            }
            i++;
            curr = curr.next;
        }
    }

    public void deleteAtIndex(int index) {
        ListNode curr = head.next;
        int i = 0;
        while (curr != null) {
            if (index == i) {
                ListNode next = curr.next;
                ListNode prev = curr.prev;
                next.prev = prev;
                prev.next = next;
            }
            i++;
            curr = curr.next;
        }
    }
}

class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */