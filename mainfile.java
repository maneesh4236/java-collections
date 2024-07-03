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
