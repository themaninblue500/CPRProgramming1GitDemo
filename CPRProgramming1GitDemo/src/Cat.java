public class Cat extends Animal {
    private String breed;

    public Cat(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public String toString() {
        return "Cat: " + "(" + "name: " + getName() + ", breed: " + breed + ")";
    }
}