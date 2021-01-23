package utils;


public class RandomNumberGenerator {
    public static int[] generateIntArray(int minValue, int maxValue, int arraySize) {
        int[] myArray = new int[100];
        int range = maxValue - minValue + 1;
        
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = (int)(java.lang.Math.random() * range) + minValue;
        }
        return myArray;
    }
}