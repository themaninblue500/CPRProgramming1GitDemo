public class App {
    public static void main(String[] args) throws Exception {
        // Parent class
        Animal animal = new Animal("Bob");
        System.out.println(animal);
        
        // Child classes
        Dog dog = new Dog("Fido", "Labrador");
        System.out.println(dog);

        Kiwi kiwi = new Kiwi("John");
        System.out.println(kiwi);



        
        Koala koala = new Koala("Tom");
        System.out.println(koala);
    }
}
