public class shrew extends Animal {
    private String species;

    public shrew(String name, String species) {
        super(name);
        this.species = species; 
    }

    public String getSpecies() {
        return species;
    }

    @Override
    public String toString() {
        return "shrew: " + "(" + "name: " + getName() + ", species: " + species + ")";
    }
    
}
