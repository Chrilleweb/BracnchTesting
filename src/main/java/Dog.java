public class Dog extends Animal {


    @Override
    public void makeSound() {
        System.out.println("vuf");
    }

    @Override
    public void mood(boolean trueOrFalse) {
        if (trueOrFalse){
            System.out.println("logrer");
        } else {
            System.out.println("knurrer");
        }
    }

    @Override
    public boolean eatMetode(String eat) {
        return true;
    }
}
