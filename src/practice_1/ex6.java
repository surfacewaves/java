package practice_1;

import java.util.Random;

public class ex6 {
    public static void main (String args[]) {
        System.out.println("Class Math. ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = classMath();
        System.out.print("Array: ");
        getArray(array);
        System.out.print("\nSorted array: ");
        bubbleSort(array);
        getArray(array);

        System.out.println("\n\nClass Random. ");
        int[] array0 = new int[10];
        for (int i = 0; i < array0.length; i++)
            array0[i] = classRandom();
        System.out.print("Array: ");
        getArray(array0);
        System.out.print("\nSorted array: ");
        bubbleSort(array0);
        getArray(array0);
    }
    static int classMath() {
        return (int) (Math.random() * 100) + 1;
    }
    static int classRandom() {
        Random r = new Random();
        int temp = r.nextInt(100) + 1;
        return temp;
    }
    static void getArray(int[] array) {
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
    }
    static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j ++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}
