package practice_1;

public class ex3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Sum of elements (cycle for) = " + cycleFor(array));
        System.out.println("Sum of elements (cycle while) = " + cycleWhile(array));
        System.out.println("Sum of elements (cycle do while) = " + cycleDoWhile(array));
    }
    static int cycleFor(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++)
            result += array[i];
        return result;
    }
    static int cycleWhile(int[] array) {
        int result = 0;
        int i = 0;
        while (i != array.length) {
            result += array[i];
            i++;
        }
        return result;
    }
    static int cycleDoWhile(int[] array) {
        int result = 0;
        int i = 0;
        do {
            result += array[i];
            i++;
        } while (i != array.length);
        return result;
    }
}