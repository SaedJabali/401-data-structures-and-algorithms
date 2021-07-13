public class Animal extends Queue<Animal> {
    String type;

    public Animal(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
