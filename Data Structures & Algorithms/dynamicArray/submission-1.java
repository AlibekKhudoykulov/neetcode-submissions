class DynamicArray {
    private int[] arr;
    private int length;
    private int capacity;

    public DynamicArray(int capacity) {
        if (capacity > 0) {
            this.arr = new int[capacity];
            this.capacity = capacity;
        }
    }

    public int get(int i) {
        return this.arr[i];
    }

    public void set(int i, int n) {
        this.arr[i] = n;
    }

    public void pushback(int n) {
        if (length == capacity) {
            resize();
        }
        arr[length] = n;
        length++;
    }

    public int popback() {
        this.length--;
        return this.arr[length];
    }

    private void resize() {
        this.capacity = 2 * this.capacity;
        int[] newArray = new int[this.capacity];
        for (int i = 0; i < length - 1; i++) {
            newArray[i] = this.arr[i];
        }
        this.arr = newArray;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
