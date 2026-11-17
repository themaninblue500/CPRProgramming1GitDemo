public class Kiwi extends Animal {

    public Kiwi(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Kiwi: " + "(" + "name: " + getName() + ")";
    }
    
}
