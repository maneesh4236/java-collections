import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {
        // List Example: ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        System.out.println("ArrayList: " + arrayList);
        
        // Remove an item
        arrayList.remove("Item 2");
        System.out.println("After removing 'Item 2': " + arrayList);
        
        // List Example: LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);
        
        // Set Example: HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet: " + hashSet);
        
        // Map Example: HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Doe", 40);
        System.out.println("HashMap: " + hashMap);
        
        // Update an entry
        hashMap.put("John", 26);
        System.out.println("After updating 'John' age: " + hashMap);
    }
}



import java.util.*;

public class CollectionExamples {
    public static void main(String[] args) {
        // List Example: ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Item 1");
        arrayList.add("Item 2");
        arrayList.add("Item 3");
        System.out.println("ArrayList: " + arrayList);
        
        // Remove an item
        arrayList.remove("Item 2");
        System.out.println("After removing 'Item 2': " + arrayList);
        
        // Update an item
        arrayList.set(0, "Updated Item 1");
        System.out.println("After updating 'Item 1': " + arrayList);
        
        // Remove all items
        List<String> itemsToRemove = Arrays.asList("Updated Item 1", "Item 3");
        arrayList.removeAll(itemsToRemove);
        System.out.println("After removing all: " + arrayList);
        
        // List Example: LinkedList
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        System.out.println("LinkedList: " + linkedList);
        
        // Set Example: HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet: " + hashSet);
        
        // Map Example: HashMap
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("John", 25);
        hashMap.put("Jane", 30);
        hashMap.put("Doe", 40);
        System.out.println("HashMap: " + hashMap);
        
        // Update an entry
        hashMap.put("John", 26);
        System.out.println("After updating 'John' age: " + hashMap);
        
        // Iterating through Map entries
        System.out.println("Entries in HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}







Use ArrayList when:

You need fast random access to elements.
Your application involves a lot of search operations.
You are not frequently adding or removing elements from the middle of the list.
Use LinkedList when:

You need to perform many insertions and deletions.
Your application involves frequent use of stack or queue operations.
You are more concerned about memory overhead due to large amounts of data being added/removed frequently.




    It represents a collection that does not allow duplicate elements. It models the mathematical set abstraction and is commonly used to store unique elements.



    No Duplicates: Like all Set implementations, HashSet does not allow duplicate elements.
Unordered Collection: HashSet does not guarantee any specific order of the elements.
Allows Null: HashSet permits the null element.
Performance: HashSet offers O(1) time complexity for add, remove, and contains operations.


    The Map interface in Java represents a collection of key-value pairs where each key is unique. It is a part of the Java Collections Framework and is used for mapping keys to values.

Characteristics of Map:
Unique Keys: Each key in the map must be unique. Duplicate keys are not allowed.
Key-Value Pairs: Each entry in the map consists of a key and a corresponding value.
Null Values: Maps can contain null values and, depending on the implementation, a single null key.




    import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        // Create a HashMap and add some entries
        Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);
        map.put("Date", 4);

        // Get : O(1) 
        Integer value = map.get("Banana");
        System.out.println("Value for key 'Banana': " + value); // Output: 2

        // Remove : O(1) 
        map.remove("Cherry");
        System.out.println("After removing 'Cherry': " + map); // Output: {Apple=1, Banana=2, Date=4}

        // Contains Key : O(1) 
        boolean hasApple = map.containsKey("Apple");
        System.out.println("Map contains key 'Apple': " + hasApple); // Output: true

        boolean hasCherry = map.containsKey("Cherry");
        System.out.println("Map contains key 'Cherry': " + hasCherry); // Output: false

        // Iteration: O(n) where n is the number of entries in the map
        System.out.println("Iterating over map entries:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        
    }
}





Characteristics of Map:
Unique Keys: Each key in the map must be unique. Duplicate keys are not allowed.
Key-Value Pairs: Each entry in the map consists of a key and a corresponding value.
Null Values: Maps can contain null values and, depending on the implementation, a single null key.
HashMap Implementation
HashMap is one of the most commonly used implementations of the Map interface. It uses a hash table for storage and allows for constant-time performance for basic operations like get and put, assuming the hash function disperses elements properly among the buckets.

Characteristics of HashMap:
Unordered Collection: The entries in a HashMap are not ordered. The order of keys and values can change over time.
Allows Null Values: HashMap permits null values and one null key.
Performance: Generally provides O(1) time complexity for put, get, remove, and containsKey operations on average.
