public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        cat.makeSound();
        dog.makeSound();
        System.out.println(dog.eatMetode("mad"));
    }
}
