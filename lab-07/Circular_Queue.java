
// Implement Circular Queue using array that performs following operations: INSERT, DELETE, DISPLAY
import java.util.Scanner;

public class Circular_Queue {
    int[] arr;
    int front = -1;
    int rear = -1;

    public void setSize(int n) {
        arr = new int[n];
    }

    int temp = 0;

    public void enqueue(int n) {
        int temp = (rear + 1) % (arr.length);
        if (temp == front) {
            System.out.println("Queue Overflow");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = temp;
            arr[rear] = n;
        }
    }

    public int dequeue() {
        if (front <= -1) {
            System.out.println("Queue Underflow");
            return -1;
        } else {
            int temp = arr[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % (arr.length);
            }
            return temp;
        }
    }

    public void display() {
        if (front <= -1) {
            System.out.println("Queue Underflow");
        } else {
            int i = front;
            System.out.println("front : " + front);
            System.out.println("rear : " + rear);
            System.out.print("Items : ");
            while (i != rear) {
                System.out.print("[" + arr[i] + "] ");
                i = (i + 1) % (arr.length);
            }
            System.out.println("[" + arr[rear] + "] ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the queue ");
        int n = sc.nextInt();

        Circular_Queue queue = new Circular_Queue();
        queue.setSize(n);

        String str = "Enter Your Choice\nPress 1 to enqueue \nPress 2 to dequeue\nPress 3 to display\nPress 4 to exit";
        System.out.println(str);
        int choice = sc.nextInt();
        while (true) {

            if (choice == 1) {
                System.out.println("Enter Element");
                queue.enqueue(sc.nextInt());
                System.out.println(str);
                choice = sc.nextInt();
            } else if (choice == 2) {
                System.out.println("Dequed Element [" + queue.dequeue() + "]");
                System.out.println(str);
                choice = sc.nextInt();
            } else if (choice == 3) {
                queue.display();
                System.out.println(str);
                choice = sc.nextInt();
            } else {
                break;
            }
        }
        sc.close();
    }
}