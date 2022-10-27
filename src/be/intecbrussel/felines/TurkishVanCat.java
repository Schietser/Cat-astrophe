package be.intecbrussel.felines;

public class TurkishVanCat extends Felis {

    public TurkishVanCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

//    public TurkishVanCat(String name, int age) {
//        super(name, age);
//    }

    public String nickname(){
        return "Kedi(r)";
    }

    @Override
    public String toString() {
        return "TurkishVanCat{" +
                super.toString()+
                "}";
    }


}
