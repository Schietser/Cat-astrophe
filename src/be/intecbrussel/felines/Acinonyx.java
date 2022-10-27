package be.intecbrussel.felines;

public class Acinonyx extends Animal{

    public Acinonyx(char size, char coat, String color, double weight, String noise, double speed) {
        super(size, coat, color, weight, noise);
        this.speed = speed;
    }

    private double speed;

    public double distance(double distance){
        return distance;
    }

    public void kiaauuww(){
        System.out.println("The animal produces a weird kiaauuww sound");
    }

}
