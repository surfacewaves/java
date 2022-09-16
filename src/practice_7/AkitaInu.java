package practice_7;

public class AkitaInu extends Dog {
    protected String name = "none";
    protected boolean cuteFace = false;

    public AkitaInu() {};

    public AkitaInu(String name, boolean cuteFace) {
        this.name = name;
        this.cuteFace = cuteFace;
    }

    public AkitaInu(float weight, String color, String name, boolean cuteFace) {
        super(weight, color);
        this.name = name;
        this.cuteFace = cuteFace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCuteFace() {
        return cuteFace;
    }

    public void setCuteFace(boolean cuteFace) {
        this.cuteFace = cuteFace;
    }

    @Override
    public String toString() {
        return "name: " + name + ", cuteFace: " + cuteFace + ", color: " + color + ", weight: " + weight;
    }
}
