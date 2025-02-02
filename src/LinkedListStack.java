public class LinkedListStack {

    private Node top;

    LinkedListStack(){
        this.top = null;
    }

    public static class Node{

        private int data;
        private Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }

    }

    public void push(int value){
        Node newNode = new Node(value);
        newNode.next = top; //newNode.next points to the old top
        top = newNode; // top now points to the current new node
    }

    public int pop(){
        int value = top.data;
        top =  top.next; //newNode.next points to old top   
        return value;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty. Nothing to show..");
            return;
        }
    
        Node tempNode = top; // Start from the top
        System.out.print("Stack (top -> bottom): ");
    
        while (tempNode != null) { // Properly check if tempNode is null
            System.out.print(tempNode.data + " --> ");
            tempNode = tempNode.next; // Move to the next node
        }
    
        System.out.println("NULL"); // End of stack
    }

    public boolean isEmpty(){
        return top == null;
    }

    public int peek(){

        if(!isEmpty())
            return top.data;
        else{
            System.out.println("Empty stack!");
            return -1;
        }

    }


    public static void main(String[] args) {
        //Create stack
        LinkedListStack stack = new LinkedListStack();

        //Add on stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);

        //Remove from stack
        stack.pop();
        int value = stack.pop();
        System.out.println("Popped value: " +value);

        //Check if stack is empty
        System.out.println("Stack is empty: " +stack.isEmpty());

        //Print the first element on the top of the stack
        int top = stack.peek();
        System.out.println("Value on the top of the stack: " +top);

        //Display stack
        stack.display();
    }
}
