package be.intecbrussel.felines;

import java.util.Arrays;

public class MainApp {

    public static void main(String[] args) {

        Animal animal = new Animal('l','l',"Black",200.0,"Growl");

        PersianCat persi = new PersianCat("Persi", 10, 111, 111);
        TurkishVanCat osman = new TurkishVanCat("Osman", 5, 111, 111);
        AndeanMountainCat dead = new AndeanMountainCat("Dead", 10, 222,222);
        NorwegianForrestCat norrie = new NorwegianForrestCat("Norrie",1, 333, 333);
        TurkishVanCat recep = new TurkishVanCat("Recep",7, 444,444);
        SiameseCat siman = new SiameseCat("Siman", 15,555,555);
        AndeanMountainCat dead2 = new AndeanMountainCat("Dead2",8,666,666);

        //2

        Felis[] felines ={persi,osman,dead,norrie,recep,siman,dead2};

        System.out.println(Arrays.toString(felines)+" ");

        //3

        System.out.println(persi.equals(osman));

        //4

        System.out.println(Animal.getAnimalcount());
        System.out.println(Felis.getNoOfVaccinatedCats());




    }



}
