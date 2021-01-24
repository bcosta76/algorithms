package datastructures.simplehashtable;

public class SimpleHashtable {

    private Employee[] hashtable;

    public SimpleHashtable() {
        hashtable = new Employee[10];
    }

    public void put(String key, Employee employee) {
        int hashedKey = hashKey(key);
        if(hashtable[hashedKey] != null)
            System.out.println("There is already a employee at position " + hashedKey);
        else
            hashtable[hashedKey] = employee;
    }

    public Employee get(String key) {
        int hashedKey = hashKey(key);
        return hashtable[hashedKey];

    }

    private int hashKey(String key) {
        return key.length() % hashtable.length;
    }

    public void printTable() {
        for(Employee emp : hashtable) {
            System.out.println(emp);
        }
    }
}
