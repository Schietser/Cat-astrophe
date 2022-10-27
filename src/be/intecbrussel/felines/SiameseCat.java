package be.intecbrussel.felines;

public class SiameseCat extends Felis {


    public SiameseCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

//    public SiameseCat(String name, int age) {
//        super(name, age);
//    }

    @Override
    public String toString() {
        return "SiameseCat{" +
                super.toString()+
                "}";
    }



}
