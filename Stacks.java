import java.util.Scanner;

public class Stacks<T> {
    private int maxSize;
    private int top;
    private T[] stackArray;

    public Stacks(int size) {
        maxSize = size;
        stackArray = (T[]) new Object[maxSize];
        top = -1;
    }

    public void push(T value) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full. Cannot push element.");
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed element: " + value);
            display();
        }
    }

    public T pop() {
        if (top == -1) {
            System.out.println("Stack is empty. Cannot pop element.");
            return null;
        } else {
            T value = stackArray[top--];
            System.out.println("Popped element: " + value);
            display();
            return value;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stackArray[i]);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the maximum number of elements for the stack: ");
        int size = scanner.nextInt();
        Stacks<Object> stack = new Stacks<>(size);

        System.out.println("Stack operations:");
        System.out.println("1. Push");
        System.out.println("2. Pop");
        System.out.println("3. Display");
        System.out.println("0. Exit");

        int choice;
        do {
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the element to push: ");
                    Object element = scanner.next();
                    stack.push(element);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        } while (choice != 0);

        scanner.close();
    }
}