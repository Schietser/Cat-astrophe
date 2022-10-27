package be.intecbrussel.felines;

public class Panthera extends Animal{

    public Panthera(char size, char coat, String color, double weight, String noise) {
        super(size, coat, color, weight, noise);
    }

    public String roar(){
        return "The Panthera creature roars";
    }

    public void hunt(){
        System.out.println("The animal is hunting");
    }










}