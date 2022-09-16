package practice_7;

public class ex1 {
    public static void main(String[] args) {
        Plate plate = new Plate("wood", "brown", "katePlate");
        plate.setMaterial("clay");
        System.out.println("material of katePlate: " + plate.getMaterial());
        System.out.println(plate);

        Cup cup = new Cup("wood", "black", "kolyaCup");
        System.out.println(cup);
    }
}

