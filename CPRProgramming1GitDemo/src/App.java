public class App {
    public static void main(String[] args) throws Exception {
        // Parent class
        Animal animal = new Animal("Bob");
        System.out.println(animal);
        
        // Child classes
        Dog dog = new Dog("Fido", "Labrador");
        System.out.println(dog);


        Fish fish = new Fish("Bubbles", "Goldfish");
        System.out.println(fish);

        shrew shrew = new shrew("Dumbo", "Black and Rufous Sengi");
        System.out.println(shrew);
        
        Kiwi kiwi = new Kiwi("John");
        System.out.println(kiwi);

        Koala koala = new Koala("Tom");
        System.out.println(koala);

        Cat cat = new Cat("Harry Potter", "Munchkin");
        System.out.println(cat);
    }
}
