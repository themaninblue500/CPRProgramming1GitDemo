public class App {
    public static void main(String[] args) throws Exception {

        // Parent class
        Animal animal = new Animal("Bob");
        System.out.println(animal);

        // Child classes
        Dog dog = new Dog("Fido");
        System.out.println(dog);
    }
}
