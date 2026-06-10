class BrowserHistory {
    ListNode head;
    ListNode curr;

    public BrowserHistory(String homepage) {
        this.head = new ListNode(homepage);
        this.curr = head;
    }

    public void visit(String url) {
        ListNode newNode = new ListNode(url);
        curr.next = newNode;
        newNode.prev = curr;
        curr = newNode;
    }

    public String back(int steps) {
        while (steps > 0 && curr.prev != null) {
            curr = curr.prev;
            steps--;
        }
        return curr.val;
    }

    public String forward(int steps) {
        while (steps > 0 && curr.next != null) {
            curr = curr.next;
            steps--;
        }
        return curr.val;
    }
}

class ListNode {
    String val;
    ListNode next;
    ListNode prev;

    ListNode(String val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */