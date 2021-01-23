
public class MyHashSet {
    private final int MAX_VALUE = 1_000_000; // no value stored in the hashset can be bigger than this
    private final int ARRAY_SIZE = 100; // my bucket list size
    private List<List<Integer>> parentList; // parent list is my bucket list. every bucket has a linked list inside

    public HashSet() {
        parentList = new ArrayList<>(ARRAY_SIZE);
        for (int i = 0; i < ARRAY_SIZE; i++) {
            parentList.add(null);
        }
    }
}