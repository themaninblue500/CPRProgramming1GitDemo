public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public Dog(String name) {
        super(name);
        this.breed = "Unknown";
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {

        return "Dog: " + "(" + "name: " + getName() + ", breed: " + breed + ")"; 
    }
}
