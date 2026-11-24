public class Koala extends Animal {
    private String sound = "hmmmmm"; 

    public Koala(String name) {
        super(name);
    }

    public String getSound() {
        return sound;
    }

    @Override
    public String toString() {
        return "Koala: " + "(" + "name: " + getName() + ", sound: " + getSound() + ")";
    }   
    
}
