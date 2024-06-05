package Data_Structure.Grafo;

import java.util.ArrayList;
import java.util.List;

public class Grafo<T> {
    private List<Vertice<T>> vertices;
    private List<Edge<T>> edges;

    public Grafo() {
        this.vertices = new ArrayList<Vertice<T>>();
        this.edges    = new ArrayList<Edge<T>>();
    }
    
    public void addVertice(T value) {
        this.vertices.add(new Vertice<T>(value));
    }

    public void addEdge(double weight, T initialValue, T endValue) {
        Vertice<T> initial = this.getVertice(initialValue);
        Vertice<T> end = this.getVertice(endValue);
        Edge<T> edge = new Edge<>(weight, initial, end);
        initial.addOutputEdge(edge);
        end.addInputEdge(edge);
        this.edges.add(edge);
    }

    public Vertice<T> getVertice(T value) {
        Vertice<T> vertice = null;
        for (int i=0; i<this.vertices.size(); i++) {
            if (this.vertices.get(i).getValue().equals(value)) {
                vertice = this.vertices.get(i);
                break;
            }
        }
        return vertice;
    }

}
