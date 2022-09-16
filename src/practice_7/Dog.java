package practice_7;

abstract public class Dog {
    protected float weight = 0;
    protected String color = "none";

    public Dog() {};

    public Dog(float weigth, String color) {
        this.weight = weigth;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    @Override
    abstract public String toString();
}
