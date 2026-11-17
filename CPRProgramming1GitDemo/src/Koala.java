public class Koala extends Animal {

    public Koala(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Koala: " + "(" + "name: " + getName() + ")";
    }   
    
}
