public class App {
    public static void main(String[] args) throws Exception {
        // Parent class
        Animal animal = new Animal("Bob");
        System.out.println(animal);
        
        // Child classes
        Dog dog = new Dog("Fido", "Labrador");
        System.out.println(dog);

        shrew shrew = new shrew("Dumbo", "Black and Rufous Sengi");
        System.out.println(shrew);
        
        Kiwi kiwi = new Kiwi("John");
        System.out.println(kiwi);
    }
}
