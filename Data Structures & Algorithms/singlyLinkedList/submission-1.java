class LinkedList {
    ListNode head;
    ListNode tail;

    public LinkedList() {
        this.head = new ListNode(-1);
        this.tail = this.head;
    }

    public int get(int index) {
        ListNode curr = head.next;
        int i = 0;
        while (curr != null) {
            if (index == i) {
                return curr.val;
            }
            i++;
            curr = curr.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        ListNode newHead = new ListNode(val);
        newHead.next = head.next;
        head.next = newHead;
        if (newHead.next == null) {
            tail = newHead;
        }
    }

    public void insertTail(int val) {
        ListNode newTail = new ListNode(val);
        tail.next = newTail;
        tail = tail.next;
    }

    public boolean remove(int index) {
        ListNode curr = head.next;
        ListNode prev = head;
        int i = 0;
        while (curr != null) {
            if (index == i) {
                if (curr == tail) {
                    tail = prev;
                }
                prev.next = curr.next;
                return true;
            }
            i++;
            prev = curr;
            curr = curr.next;

        }
        return false;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode curr = head.next;
        while (curr != null) {
            res.add(curr.val);
            curr = curr.next;
        }
        return res;
    }
}

class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }

    public ListNode(int val, ListNode node) {
        this.val = val;
        this.next = node;
    }
}
