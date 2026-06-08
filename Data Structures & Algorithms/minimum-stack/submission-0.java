class MinStack {
    private int[] arr;
    private int top;
    private int min;

    public MinStack() {
        this.arr = new int[10];
    }
    
    public void push(int val) {
        if(val < min) min = val;
        arr[top++] = val;
    }
    
    public void pop() {
        top--;
        for(int num: this.arr){
            if(num < this.min){
                this.min = num;
            }
        }
    }
    
    public int top() {
        return top;
    }
    
    public int getMin() {
        return min;
    }
}
