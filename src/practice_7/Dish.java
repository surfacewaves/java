package practice_7;

abstract public class Dish {
    protected String material = "none";

    protected String color = "none";

    public Dish() {};

    public Dish(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    @Override
    public abstract String toString();
}