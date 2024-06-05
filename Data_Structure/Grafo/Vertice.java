package Data_Structure.Grafo;

import java.util.ArrayList;
import java.util.List;

public class Vertice<T> {
    private T value;
    private List<Edge<T>> inputEdge;
    private List<Edge<T>> outputEdge;
    

    public Vertice(T value) {
        this.value = value;
        this.inputEdge = new ArrayList<Edge<T>>();
        this.outputEdge = new ArrayList<Edge<T>>();
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void addInputEdge(Edge<T> edge) {
        this.inputEdge.add(edge);
    }

    public void addOutputEdge(Edge<T> edge) {
        this.outputEdge.add(edge);
    }

}
