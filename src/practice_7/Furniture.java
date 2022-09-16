package practice_7;

abstract public class Furniture {
    protected String form = "none";
    protected float weight = 0;

    public Furniture() {};

    public Furniture(String form, float weight) {
        this.form = form;
        this.weight = weight;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    abstract public String toString();
}
