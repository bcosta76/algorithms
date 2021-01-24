// Simple HashSet implementation
// Need todo implement rehashing
package datastructure.simplehashset;

import java.util.LinkedList;
import java.util.List;

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

    public void add(int key) {
        int idex = key % ARRAY_SIZE; // mapping it to a bucket in my parent list
        List<Integer> childList = parentList.get(index);
        if(childList == null) {
            childList = new LinkedList<>();
            list.add(key);
            parentList.set(index, childList);
        }
        else {
            if (!childList.contains(key)) {
                childList.add(key);
            }
        }
    }

    public void remove(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        if (childList != null) {
            childList.remove(Integer.valueOf(key)); // remove the value, not the position 
        }
    }

    public boolean contains(int key) {
        int index = key % ARRAY_SIZE;
        List<Integer> childList = parentList.get(index);
        return childList != null && childList.contains(key);
    }
}