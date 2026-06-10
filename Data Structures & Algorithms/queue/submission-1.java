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
        newNode.prev = tail.prev;
        newNode.next = tail;
        tail.prev.next = newNode;
        tail.prev = newNode;
        size++;
    }

    public void appendleft(int value) {
        ListNode newNode = new ListNode(value);
        newNode.next = head.next;
        newNode.prev = head;
        head.next.prev = newNode;
        head.next = newNode;
        size++;
    }

    public int pop() {
        if (size > 0) {
            ListNode target = tail.prev;
            int value = target.val;
            target.prev.next = tail;
            tail.prev = target.prev;
            size--;
            return value;
        }
        return -1;
    }

    public int popleft() {
        if (size > 0) {
            ListNode target = head.next;
            int value = target.val;
            head.next = target.next;
            target.next.prev = head;
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