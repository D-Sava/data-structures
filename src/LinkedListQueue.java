//Implementation of Queue using Linked List
public class LinkedListQueue {
    
    private static class Node{

        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node front, rear;

    public LinkedListQueue(){
        front = rear = null;
    }

    //1st Method: Enqueue
    private void enqueue(int value){

        Node newNode = new Node(value);

        if(rear == null)
            front = rear = newNode;
        else{
            rear.next = newNode;
            rear = newNode;
        }
    }

    //2nd Method: Dequeue
    private int dequeue(){
        if(front == null){
            System.out.println("Queue underflow!");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if(front == null)
            rear = null;

        return value;
    }

    //3rd Method: Peek
    private int peek(){
        return front != null ? front.data : -1;
    }

    //4th Method: isEmpty
    private boolean isEmpty(){
        return front == null;
    }

    private void display(){
        if(front == null){
            System.out.println("Queue is empty!");
            return;
        }

        System.out.print("Queue (front -> rear): ");
        Node tempNode = front;

        while(tempNode != null){
            System.out.print(tempNode.data + " --> ");
            tempNode = tempNode.next;
        }

        System.out.println("NULL!");
    }

    public static void main(String[] args) {
        
        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(5);
        queue.enqueue(15);
        queue.enqueue(25);
        queue.enqueue(35);
        queue.enqueue(45);

        System.out.println("Removing first element: " +queue.dequeue());
        System.out.println("Is queue empty? " +queue.isEmpty());
        System.out.println("First element in the queue: " +queue.peek());

        queue.display();
    }
}
