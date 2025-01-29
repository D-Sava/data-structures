public class BuiltinStack {

    public void stack(){
        //Creation of stack - LIFO principle (Last in, first out)
        java.util.Stack<Integer> stack = new java.util.Stack<>();

        //Adding elements on the top of the stack
        stack.push(1);
        stack.push(10);
        stack.push(100);
        stack.push(101);
        stack.push(102);
        stack.push(103);

        //Removing elements from the top of the stack
        stack.pop();
        stack.pop();
        stack.pop();

        //Stack preview
        System.out.println("Stack: "+stack);

        //Print out the first element in the stack
        System.out.println("First element: " +stack.peek());

        //Check if stack is empty
        System.out.println("Is stack empty? "+stack.isEmpty());

        //Search through stack (First element in stack is 1)
        int index = stack.search(101);
        System.out.println("Position: " +index);

    }

    public static void main(String[] args) {
        
    }
}
