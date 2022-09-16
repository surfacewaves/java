package practice_7;

public class Table extends Furniture {
    protected String name = "none";
    protected String color = "none";

    public Table() {};

    public Table(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public Table(String form, float weight, String name, String color) {
        super(form, weight);
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "name: " + name + ", form: " + form + ", color: " + color + ", weight: " + weight;
    }
}
