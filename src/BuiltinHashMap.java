package src;
import java.util.HashMap;

public class BuiltinHashMap {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> map = new HashMap<>();

        // Add entries
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 28);

        // Retrieve a value
        int age = map.get("Bob"); // 30

        // Remove an entry
        map.remove("Alice");

        // Check existence
        boolean hasCharlie = map.containsKey("Charlie"); // true

        // Iterate over entries
        map.forEach((key, value) -> 
            System.out.println(key + ": " + value)
        );
    }
}