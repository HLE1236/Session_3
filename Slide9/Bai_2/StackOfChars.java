public class StackOfChars {
    private char[] elements;
    private int size;
    private int capacity;

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == capacity;
    }

    public char peak() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return elements[size - 1];
    }

    public void push(char value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full");
        }
        elements[size++] = value;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        char value = elements[--size];
        return value;
    }

    public int getSize() {
        return size;
    }
}