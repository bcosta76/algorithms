package sorts;

import utils.RandomNumberGenerator;

public class InsertionSort {

    private int[] sort(int[] myArray) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < myArray.length; firstUnsortedIndex++) {
            int newElement = myArray[firstUnsortedIndex];
            int i = firstUnsortedIndex;
            for (; i > 0 && myArray[i-1] > newElement; i--) {
                myArray[i] = myArray[i-1];
            }
            myArray[i] = newElement;
        }
        return myArray;
    }

    public static void main(String[] args) {
        int[] myArray = RandomNumberGenerator.generateIntArray(1, 1000, 100); 
        
        InsertionSort is = new InsertionSort();
        myArray = is.sort(myArray);

        for (int n : myArray)
            System.out.println(n);
    }
}