import java.util.Scanner;
import java.util.LinkedList;

public class QueueProgram {
    private LinkedList<Integer> items = new LinkedList<Integer>();

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void enqueue(int item) {
        items.addLast(item);
    }

    public Integer dequeue() {
        if (isEmpty()) {
            return null; // Or throw an exception if you prefer
        }
        return items.removeFirst();
    }

    public Integer peek() {
        if (isEmpty()) {
            return null; // Or throw an exception if you prefer
        }
        return items.getFirst();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueProgram myQueue = new QueueProgram();

        int choice;

        do {
            System.out.println("\nQueue Operations");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter item to enqueue: ");
                    int item = scanner.nextInt();
                    myQueue.enqueue(item);
                    System.out.println("Item " + item + " enqueued successfully.");
                    break;
                case 2:
                    Integer dequeuedItem = myQueue.dequeue();
                    if (dequeuedItem != null) {
                        System.out.println("Dequeued item: " + dequeuedItem);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 3:
                    Integer frontItem = myQueue.peek();
                    if (frontItem != null) {
                        System.out.println("Front item: " + frontItem);
                    } else {
                        System.out.println("Queue is empty.");
                    }
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
