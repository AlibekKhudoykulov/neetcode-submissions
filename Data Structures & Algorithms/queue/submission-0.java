class Deque {
    ListNode head;
    ListNode tail;
    int size = 0;

    public Deque() {
        head = new ListNode(-1);
        tail = new ListNode(-1);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void append(int value) {
        ListNode newNode = new ListNode(value);
        newNode.prev = tail;
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void appendleft(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head.next;
        head.next.prev = newNode;
        head.next = newNode;
        size++;
    }

    public int pop() {
        if (size > 0 && tail.prev != null) {
            int value = tail.val;
            ListNode temp = tail.prev;
            temp.next = null;
            tail.prev = null;
            tail = temp;
            size--;
            return value;
        }
        return -1;
    }

    public int popleft() {
        if (head.next != null && size > 0) {
            int value = head.next.val;
            ListNode temp = head.next.next;
            temp.prev = null;
            head.next.next = null;
            head.next = temp;
            size--;
            return value;
        }
        return -1;
    }
}

class ListNode {
    int val;
    ListNode prev;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        prev = null;
        next = null;
    }
}