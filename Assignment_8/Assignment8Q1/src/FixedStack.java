import java.util.Stack;

public class FixedStack implements StackInterface{
    private Stack<Employee> stack;
    private static final int size = 5;

    public FixedStack() {
        stack = new Stack<>();
    }

    @Override
    public void push(Employee emp) {
        if (stack.size() == size) {
            System.out.println("Stack is full! Cannot push more employees.");
        } else {
            stack.push(emp);
            System.out.println("Pushed: " + emp);
        }
    }

    @Override
    public Employee pop() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty! Nothing to pop.");
            return null;
        } else {
            return stack.pop();
        }
    }
}

