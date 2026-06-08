class Solution {
    public int calPoints(String[] operations) {
        int res = 0;
        Deque<Integer> stack = new ArrayDeque<>();
        for (String operation : operations) {
            switch (operation) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    stack.push(stack.peek() * 2);
                    break;
                case "+":
                    int top = stack.pop();
                    int newTop = stack.peek();
                    int sum = top + newTop;
                    stack.push(top);
                    stack.push(sum);
                    break;
                default:
                    stack.push(Integer.parseInt(operation));
                    break;
            }
        }
        for (Integer score : stack) {
            res += score;
        }
        return res;
    }
}