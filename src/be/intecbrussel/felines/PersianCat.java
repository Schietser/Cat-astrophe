package be.intecbrussel.felines;

public class PersianCat extends Felis{


    public PersianCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

//    public PersianCat(String name, int age) {
//        super(name, age);
//    }

    @Override
    public void miauw() {
        super.miauw();
    }

    @Override
    public String toString() {
        return "PersianCat{" +
                super.toString()+
                "}";
    }


}

