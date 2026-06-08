class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (String token : tokens) {
            int first, second;
            switch (token) {
                case "+":
                     first = stack.pop();
                     second = stack.pop();
                    stack.push(first + second);
                    break;
                case "-":
                     first = stack.pop();
                     second = stack.pop();
                    stack.push(second - first);
                    break;
                case "*":
                     first = stack.pop();
                     second = stack.pop();
                    stack.push(first * second);
                    break;
                case "/":
                     first = stack.pop();
                     second = stack.pop();
                    stack.push(second + first);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
                     break;
            }
        }
        return stack.peek();
    }
}
