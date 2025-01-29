import java.util.Hashtable;

// Hashtable = A data structure that stores unique keys to values ex.<Integer, String>
// Each key/value pair is known as an Entry

// FAST insertion, look up, deletion of key/value pairs

// Not ideal for small data sets, great with large data sets

// hashing = takes a key and computes an integer (formula will vary based on key & data type)
// In a Hashtable, we use the hash % capacity to calculate an index number

// key.hashCode() % capacity = index

// bucket = an indexed storage location for one or more Entries
// can store multiple Entries in case of a collision (linked similarly to a LinkedList)

// collision = hash function generates the same index for more than one key
// less collisions = more efficiency

// Runtime complexity: Best Case O(1)
//                     Worst Case O(n)

public class BuiltinHashTable {
    public static void main(String[] args) {
        
        //create hash table
        Hashtable<Integer, String> table = new Hashtable<>(10);

        //put values in the table
        table.put(100, "Earth");
        table.put(101, "Sun");
        table.put(102, "Mercury");
        table.put(103, "Saturn");

        //remove values from the table
        table.remove(103);

        //print hash table
        for(Integer key : table.keySet()){
            System.out.println(key.hashCode() + "\t" + key + "\t" + table.get(key));
        }

    }
    
}
