
import java.util.Map;
import java.util.TreeMap;



public class collectionsFramework{
    public static void main(String[] args){
        // Set<String> set = new HashSet<>();
        // set.add("apple");
        // set.add("mango");
        // set.add("banana");
        // set.add("apple");

        // System.out.println(set);


        // Map<Integer, String> map = new HashMap<>();
        // map.put(1, "Apple");
        // map.put(2, "Banana");
        // map.put(1, "Cherry"); // Key 1 updated

        // System.out.println("Map: " + map); // Output: {1=Cherry, 2=Banana}
 

        // Example---------------------------------------------------
        // HashMap<Integer, String> map = new HashMap<>();

        // map.put(1, "Apple");
        // map.put(2, "banana");
        // map.put(3, "cherry");

        // System.out.println("Value for key 2: " + map.get(2));
        // System.out.println("Contains key 3? " + map.containsKey(3));
        // System.out.println("Contains value 'Apple' ? " + map.containsValue("Apple"));

        // map.remove(1);
        // System.out.println("After removing key 1: " + map);

        // for (Integer key: map.keySet()){
        //     System.out.println("Key: " + key);
        // }

        // for (String value: map.values()){
        //     System.out.println("Value: " + value);
        // }

        // for (HashMap.Entry<Integer, String> entry: map.entrySet()){
        //     System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        // }


        // Queue--------------------------------------------------------------------------------------
        // Queue<String> queue = new LinkedList<>();
        // queue.add("Apple");
        // queue.add("banana");
        // queue.add("mango");

        // System.out.println("Queue: " + queue);
        // System.out.println("Polled: " + queue.poll());
        // System.out.println("Queue after polling: " + queue);


        // Deque<String> deque = new ArrayDeque<>();
        // deque.addFirst("Apple");
        // deque.addLast("Banana");
        // deque.addLast("Apple2");

        // System.out.println("Deque: " + deque);
        // System.out.println("Removed first element: " + deque.removeFirst());
        // System.out.println("Que after removal: " + deque);


        // Stack<String> stack = new Stack<>();
        // stack.push("apple");
        // stack.push("banana");
        // stack.push("cherry");
        
        // System.out.println("stack: " + stack);
        // System.out.println("Popped: " + stack.pop());
        // System.out.println("stack after popping: " + stack);


        // Sorted collection---------------------------------------------------------------------s
        // TreeSet<Integer> tSet = new TreeSet<>();
        // tSet.add(1);
        // tSet.add(2);
        // tSet.add(3);

        // System.out.println(tSet);

        // for (int i: tSet){
        //     System.out.println(i);
        // }


        // TreeMap<Integer, String> tMap = new TreeMap<>();

        // tMap.put(5, "apple");
        // tMap.put(1, "banana");
        // tMap.put(2, "cherry");

        // System.out.println(tMap);

        // for (int i: tMap.keySet()){
        //     System.out.println(i);
        //     System.out.println("Value: " + tMap.get(i));
        // }


        // TreeMap---------------------------------------------------------
        // TreeMap<Integer, String> tMap = new TreeMap<>((a,b)->b-a);
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "apple");
        tMap.put(2, "banana");
        tMap.put(3, "cherry");
        tMap.put(4, "mango");
        tMap.put(5, "pineapple");
        tMap.put(6, "grapes");

        System.out.println("Entire tree: " + tMap);
        System.out.println("Contains key: " + tMap.containsKey(1));
        System.out.println("Contains value: " + tMap.containsValue("apple"));
        System.out.println("Value for key 3: " + tMap.get(3));

        System.out.println("First key: " + tMap.firstKey());
        System.out.println("Last key: " + tMap.lastKey());
        System.out.println("First entry: " + tMap.firstEntry());
        System.out.println("Last Entry: " + tMap.lastEntry());

        System.out.println("Sub Map: " + tMap.subMap(2, 3));
        // System.out.println("Sub map: " + tMap.subMap(3, 2)); // if using reverse (a,b)->b-a

        for (Integer key: tMap.keySet()){
            System.out.println("Key: " + key);
        }

        for (String value: tMap.values()){
            System.out.println("Values: " + value);
        }
        
        // DON'T USE TREEMAP HERE, USE MAP INSTEAD, AS IT IS RATHER PUBLIC...
        for (Map.Entry<Integer, String> entry: tMap.entrySet()){
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        //Returns the smallest key in the map greater than or equal to the given key.
        System.out.println("Smallest Key greater than or equals to 2: " + tMap.ceilingKey(2));
        System.out.println("Smallest Entry greater than or equals to 2: " + tMap.ceilingEntry(2));
        
        //Returns the largest key in the map less than or equal to the given key.
        System.out.println("Largest Key less than or equals to 2: " + tMap.ceilingKey(2));

        //Returns the smallest key in the map strictly greater than the given key.
        System.out.println("Higher key (> 2): " + tMap.higherKey(2));

        //Returns the largest key in the map strictly less than the given key.
        System.out.println("Lower key (< 2): " + tMap.lowerKey(2));
        

        tMap.remove(1);
        System.out.println("Tree after removing key 1: " + tMap);
    }

}