class Solution {
    public boolean isValid(String s) {
        Deque<Character> stack = new ArrayDeque<>();
        for(char character: s.toCharArray()){
            if(character=='(' || character=='{' || character=='['){
                stack.push(character);
            }else if(!stack.isEmpty()){
                if(stack.peek()=='(' && character == ')' ){
                    stack.pop();
                }else if(stack.peek()=='{' && character == '}' ){
                    stack.pop();
                }else if(stack.peek()=='[' && character == ']' ){
                    stack.pop();
                }else{
                    return false;
                }
            }else{
                return false;
            }
        }
        return stack.isEmpty();
    }
}
