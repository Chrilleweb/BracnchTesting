public class Main {
    public static void main(String[] args){
        Cat cat = new Cat();
        Dog dog = new Dog();
        System.out.print("Katten siger: ");cat.makeSound();
        System.out.print("Hunden siger: ");dog.makeSound();
        System.out.println(dog.eatMetode("hundemad"));
        System.out.println(cat.eatMetode("fish"));
        System.out.print("Katten ");cat.mood(false);
        System.out.print("Hunden ");dog.mood(true);
    }
}
