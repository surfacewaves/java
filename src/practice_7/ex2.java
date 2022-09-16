package practice_7;

public class ex2 {
    public static void main(String[] args) {
        Corgi corgi = new Corgi(5.0F, "orange", "corgi", true);
        corgi.setName("best dog in the world");
        System.out.println(corgi);

        AkitaInu akitaInu = new AkitaInu(10.0F, "white and orange", "akitaInu", true);
        System.out.println(akitaInu);
    }
}
