package graph.data;

public class Vertex {

     Object value;

    public Vertex(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return " Vertex{ " + " value = " + value + " }";
    }
}
