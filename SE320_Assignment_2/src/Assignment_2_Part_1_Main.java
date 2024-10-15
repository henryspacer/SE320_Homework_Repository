public class Assignment_2_Part_1_Main<E> {
    private E[] stack;
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public Assignment_2_Part_1_Main() {
        this.stack = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public Assignment_2_Part_1_Main(int initialCapacity) {
        if (initialCapacity <= 0) {
            throw new IllegalArgumentException("Initial capacity must be greater than 0.");
        }
        this.stack = (E[]) new Object[initialCapacity];
    }

    public int getSize() {
        return size;
    }

    public E peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return stack[size - 1];
    }

    public void push(E o) {
        if (size == stack.length) {
            resize();
        }
        stack[size++] = o;
    }

    public E pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        E element = stack[--size];
        stack[size] = null;
        return element;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private void resize() {
        E[] newStack = (E[]) new Object[stack.length * 2];
        System.arraycopy(stack, 0, newStack, 0, size);
        stack = newStack;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("stack: [");
        for (int i = 0; i < size; i++) {
            sb.append(stack[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
// I may be going about implementing a basic array incorrectly, since the file won't run
// I tried asking chatGPT what the issue is and I still have no clue why :(
