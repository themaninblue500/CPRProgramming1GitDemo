public class Fish extends Animal{
    private String species;

    public Fish(String name, String species) {
        super(name);
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "Fish: " + "(" + "name: " + getName() + ", Species: " + species + ")"; 
    }
}
