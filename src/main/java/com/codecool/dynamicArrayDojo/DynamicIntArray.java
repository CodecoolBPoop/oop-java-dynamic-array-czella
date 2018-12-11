package com.codecool.dynamicArrayDojo;
import java.util.Arrays;

// put your code here!
public class DynamicIntArray {

    private int[] staticArray;

    public DynamicIntArray() {
        staticArray = new int[0];
    }
    public DynamicIntArray(int length) {
        staticArray = new int[length];
    }

    @Override
    public String toString() {
        return Arrays.toString(staticArray);
    }

    public void add(int newElem) {
        int[] result = new int[staticArray.length + 1];
        System.arraycopy( staticArray, 0, result, 0, staticArray.length );
        result[-1] = newElem;
        staticArray = result;
    }

    public void remove(int indexToRemoveFrom) {
        int[] result = new int[staticArray.length - 1];
        int count = 0;
        for (int i = 0; i < staticArray.length; i++) {
            if (i != indexToRemoveFrom) {
                result[count] = staticArray[i];
                count++;
            }
        }
        staticArray = result;
    }

    public void insert(int indexToInsert, int elemToInsert) {
        int[] result = new int[staticArray.length + 1];
        int count = 0;
        for (int i = 0; i < staticArray.length; i++) {
            if (i == indexToInsert && indexToInsert < staticArray.length) {
                result[count] = staticArray[i];
                count++;
            } else {
                result[-1] = staticArray[i];
            }
        }
        staticArray = result;
    }
}
