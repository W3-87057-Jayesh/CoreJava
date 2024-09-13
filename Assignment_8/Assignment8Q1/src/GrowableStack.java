import java.util.Stack;

public class GrowableStack implements StackInterface{
    private Stack<Employee> stack;

    public GrowableStack() {
        stack = new Stack<>();
    }

    @Override
    public void push(Employee emp) {
        stack.push(emp);
        System.out.println("Pushed: " + emp);
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
