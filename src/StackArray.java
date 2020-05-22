

public class StackArray {

    private int maxSize;
    private int[] stackData;
    private int top;

    public StackArray() {
        maxSize = 20;
        stackData = new int[maxSize];
        top = -1;

    }

    public void push(int number) {
        if (isFull()) {
            System.err.println("Stack is Full !!");

        } else {
            top = top + 1;
            stackData[top] = number;
        }
    }

    //should prevent doing the funtion if stack is empty from the interface
    public int pop() {
        int topNew = 0;
        if (isEmpty()) {
            System.err.println("Stack is empty !!");
            return this.maxSize;
        } else {
            topNew = top;
            top = top - 1;
            return stackData[topNew];
        }

    }

    //should prevent doing the funtion if stack is empty from the interface
    public int peak() {
        return stackData[top];

    }

    public boolean isEmpty() {
        boolean empty=false;
        if (top == -1) {
            empty = true;
        } 
        return empty;

    }

    private boolean isFull() {

        boolean full=false;
        if (top == maxSize - 1) {
            full = true;
        } 
        return full;
    }

    public int getTop() {
        return top;
    }
    

}
