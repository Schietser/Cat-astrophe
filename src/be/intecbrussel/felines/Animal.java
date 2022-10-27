package be.intecbrussel.felines;

public class Animal {


    private char size;
    private char coat;
    private String color;
    private double weight;
    private String noise = "Animal noise";

    private static int Animalcount;


    {
        Animalcount++;
    }


    public Animal() {
    }

    public Animal(char size, char coat, String color, double weight, String noise) {
        this.size = size;
        this.coat = coat;
        this.color = color;
        this.weight = weight;
        this.noise = noise;
    }

    public static int getAnimalcount() {
        return Animalcount;
    }

    //Methodes

    public String makeNoise(String noise){
        return noise;
    }

    public void eat(){
        System.out.println("The animal is eating");
    }

    public void sleep (){
        System.out.println("The animal is sleeping");
    }

    public boolean isAlive(){
        return true;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "size=" + size +
                ", coat=" + coat +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", noise='" + noise + '\'' +
                '}';
    }
}
