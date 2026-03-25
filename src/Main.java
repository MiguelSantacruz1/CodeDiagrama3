public class Main {
    public static void main(String[] args) {

        Animal a = new Animal("AnimalGenérico");
        System.out.println(a);

        Mammal m = new Mammal("Mamífero");
        System.out.println(m);

        Cat cat = new Cat("Michi");
        System.out.println(cat);
        cat.greets(); // Meow

        Dog dog1 = new Dog("Firulais");
        Dog dog2 = new Dog("Rocky");

        System.out.println(dog1);
        dog1.greets();        // Woof
        dog1.greets(dog2);    // Woooof
    }
}