public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.print("Katten siger: ");cat.makeSound();
        System.out.print("Hunden siger: ");dog.makeSound();
        System.out.println(dog.eatMetode("hundemad"));
        System.out.println(cat.eatMetode("fish"));
    }
}
