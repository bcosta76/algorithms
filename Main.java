import utils.RandomNumberGenerator;

public class Main {
    
    // test the class utils/RandomNumberGenerator.java
    private void testRandomNumberGenerator() {
        int[] myArray = RandomNumberGenerator.generateIntArray(1, 10, 100);
        for (int n : myArray)
            System.out.println(n);
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.testRandomNumberGenerator();
    }
}