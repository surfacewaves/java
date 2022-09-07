package practice_1;

public class ex5 {
    public static void main (String[] args) {
        System.out.println("The first 10 numbers of the harmonic series:");
        harmonicSeries();
    }
    static void harmonicSeries() {
        for (int i = 1; i < 11; i++) {
            System.out.printf("1/%d", i);
            if (i != 10) System.out.print(", ");
        }
    }
}
