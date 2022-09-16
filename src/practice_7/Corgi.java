package practice_7;

public class Corgi extends Dog {
    protected String name = "none";
    protected boolean cuteAss = false;

    public Corgi() {};

    public Corgi(String name, boolean cuteAss) {
        this.name = name;
        this.cuteAss = cuteAss;
    }

    public Corgi(float weight, String color, String name, boolean cuteAss) {
        super(weight, color);
        this.name = name;
        this.cuteAss = cuteAss;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isCuteAss() {
        return cuteAss;
    }

    public void setCuteAss(boolean cuteAss) {
        this.cuteAss = cuteAss;
    }

    @Override
    public String toString() {
        return "name: " + name + ", cuteAss: " + cuteAss + ", color: " + color + ", weight: " + weight;
    }
}
