public class Cat extends Animal {


    @Override
    public void makeSound() {
        System.out.println("meow");
    }

    @Override
    public boolean eatMetode(String eat) {
        return true;
    }
}
