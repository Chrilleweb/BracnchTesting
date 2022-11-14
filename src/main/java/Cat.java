public class Cat extends Animal {


    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    public void mood(boolean trueOrFalse) {
        if (trueOrFalse){
            System.out.println("spinder");
        } else {
            System.out.println("hvæser");
        }
    }

    @Override
    public boolean eatMetode(String eat) {
        return true;
    }
}
