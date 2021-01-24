package datastructures.simplehashtable;

public class Main {

    public static void main(String[] args) {
	    Employee janeJones = new Employee("Jane","Jones",1);
        Employee johnDoe = new Employee("John","Doe",2);
        Employee elizabethJenkins = new Employee("Elizabeth","Jenkins",3);

        SimpleHashtable hashtable = new SimpleHashtable();
        hashtable.put(janeJones.getLastName(), janeJones);
        hashtable.put(johnDoe.getLastName(), johnDoe);
        hashtable.put(elizabethJenkins.getLastName(), elizabethJenkins);

        //hashtable.printTable();

        System.out.println(hashtable.get("Doe"));
    }
}
