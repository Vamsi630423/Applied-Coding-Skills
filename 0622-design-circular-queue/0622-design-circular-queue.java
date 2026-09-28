class MyCircularQueue {
    private int[] q;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public MyCircularQueue(int k) {
        this.capacity = k;
        this.q = new int[k];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }
    
    public boolean enQueue(int value) {
        if (isFull()) {
            return false;
        }
        rear = (rear + 1) % capacity;
        q[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if (isEmpty()) {
            return false;
        }
        front = (front + 1) % capacity;
        size--;
        return true;
    }
    
    public int Front() {
        if (isEmpty()) {
            return -1;
        }
        return q[front];
    }
    
    public int Rear() {
        if (isEmpty()) {
            return -1;
        }
        return q[rear];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}