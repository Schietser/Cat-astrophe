package be.intecbrussel.felines;

import java.util.Objects;
import java.util.Random;

public class Felis extends Animal {

    Random random = new Random();

    public static int vaccinationCount;
    private String name;
    private int age;
    private int shelterNo;
    private int badgeNo;


    {
        if (isAlive()==true){
            vaccinationCount++;
        }
    }


    public Felis(String name, int age, int shelterNo, int badgeNo) { //om de equals te testen
        this.name = name;
        this.age = age;
        this.shelterNo = shelterNo;
        this.badgeNo = badgeNo;
    }

    public Felis(String name, int age) { //Bij aankomst wordt random shelterno & badgeno aangemaakt binnen bounds
        this.name = name;
        this.age = age;
        this.shelterNo = random.nextInt(999-1)+1;
        this.badgeNo = random.nextInt(999-1)+1;
    }

    //Getter
    public static int getNoOfVaccinatedCats() {
            return vaccinationCount;
    }


    //Methods

    public void miauw(){
        System.out.println("The felis miauws");
    }

    public int miauw(int times){
        return times;
    }

    @Override
    public String toString() {
        return "Felis{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", shelterNo=" + shelterNo +
                ", badgeNo=" + badgeNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Felis)) return false;
        Felis felis = (Felis) o;
        return shelterNo == felis.shelterNo && badgeNo == felis.badgeNo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shelterNo, badgeNo);
    }
}
