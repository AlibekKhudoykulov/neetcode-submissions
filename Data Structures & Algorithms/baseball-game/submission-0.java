class Solution {
    public int calPoints(String[] operations) {
        int res = 0;
        Deque<String> stack = new ArrayDeque<>();
        for (String operation : operations) {
            switch (operation) {
                case "C":
                    stack.pop();
                    break;
                case "D":
                    int sum = Integer.parseInt(stack.peek()) * 2;
                    stack.push(String.valueOf(sum));
                    break;
                case "+":
                    int lastNumber = Integer.parseInt(stack.pop());
                    int ans = lastNumber + Integer.parseInt(stack.peek());
                    stack.push(String.valueOf(lastNumber));
                    stack.push(String.valueOf(ans));
                    break;
                default:
                    stack.push(operation);
            }
        }
        for (String item : stack) {
            res += Integer.parseInt(item);
        }
        return res;
    }
}