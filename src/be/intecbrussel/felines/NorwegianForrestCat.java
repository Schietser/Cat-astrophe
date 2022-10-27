package be.intecbrussel.felines;

public class NorwegianForrestCat extends Felis {

    public NorwegianForrestCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

//    public NorwegianForrestCat(String name, int age) {
//        super(name, age);
//    }

    public void miauwInNorvegian(){
        System.out.println("Mjau");
    }

    @Override
    public String toString() {
        return "NorwegianForrestCat{" +
                super.toString()+
                "}";
    }
}
