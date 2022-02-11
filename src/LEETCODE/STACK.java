package LEETCODE;

import java.util.Stack;

class MinStack {
    Stack<Integer> a;

    public MinStack() {
        a = new Stack<>();
    }

    public void push(int val) {
        a.push(val);
    }

    public void pop() {
        a.pop();
    }

    public int top() {
        return a.peek();
    }

    public int getMin() {
        int min = a.peek();
        for(int i=0; i<a.size(); i++){
            if(a.get(i)<min) min = a.get(i);
        }
        return min;
    }
}
