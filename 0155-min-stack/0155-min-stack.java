class MinStack {
    Stack<Integer>s;
    Stack<Integer> ms;
    public MinStack() {
        s=new Stack<>();
        ms=new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(ms.isEmpty()){
            ms.push(value);
        }else{
            int min=Math.min(value,ms.peek());
            ms.push(min);
        }
    }
    
    public void pop() {
        s.pop();
        ms.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}
