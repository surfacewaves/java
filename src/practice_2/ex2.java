package practice_2;

public class ex2 {
}

class Ball {
    String nameSport;
    float weight;
    {
        nameSport = "none";
        weight = 0;
    }
    Ball() {

    }
    Ball(String nameSport) {
        this.nameSport = nameSport;
    }
    Ball(String nameSport, float weight) {
        this.nameSport = nameSport;
        this.weight = weight;
    }
    void setNameSport(String nameSport) {
        this.nameSport = nameSport;
    }
    String getNameSport() {
        return nameSport;
    }
    void setWeight(float weight) {
        this.weight = weight;
    }
    float getWeight() {
        return weight;
    }
    public String toString() {
        return nameSport + " " + weight;
    }
}