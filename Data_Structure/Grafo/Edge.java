package Data_Structure.Grafo;

public class Edge<T> {
    private Double weight;
    private Vertice<T> initial;
    private Vertice<T> end;

    public Edge(Double weight, Vertice<T> initial, Vertice<T> end) {
        this.weight = weight;
        this.initial = initial;
        this.end = end;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Vertice<T> getInitial() {
        return this.initial;
    }

    public void setInitial(Vertice<T> initial) {
        this.initial = initial;
    }

    public Vertice<T> getEnd() {
        return this.end;
    }

    public void setEnd(Vertice<T> end) {
        this.end = end;
    }

}
