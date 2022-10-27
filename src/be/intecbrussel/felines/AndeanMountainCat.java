package be.intecbrussel.felines;

public class AndeanMountainCat extends Felis {

    public AndeanMountainCat(String name, int age, int shelterNo, int badgeNo) {
        super(name, age, shelterNo, badgeNo);
    }

//    public AndeanMountainCat(String name, int age) {
//        super(name, age);
//    }

    @Override
    public void miauw() {
        System.out.println("The cat has a weird miauw," +
                " as if the cat has been extinct and we never really payed attention to how it miauwed");
    }

    @Override
    public boolean isAlive() {
        return false;
    }

    @Override
    public String toString() {
        return "AndeanMountainCat{" +
                super.toString()+
                "}";
    }


}
