package practice_7;

public class Cup extends Dish {
    protected String name = "none";

    public Cup() {};

    public Cup(String name) {
        this.name = name;
    }

    public Cup(String material, String color, String name) {
        super(material, color);
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name + ", material: " + material + ", color: " + color;
    }
}
