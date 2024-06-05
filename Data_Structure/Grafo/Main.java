package Data_Structure.Grafo;

public class Main {
    public static void main(String[] args) {
        Grafo<String> grafo = new Grafo<>();
        grafo.addVertice("João");
        grafo.addVertice("Lorenzo");
        grafo.addVertice("Creuza");
        grafo.addVertice("Créber");
        grafo.addVertice("Cráudio");

        grafo.addEdge(2., "João", "Lorenzo");
        grafo.addEdge(3., "Lorenzo", "Créber");
        grafo.addEdge(1., "Créber", "Creuza");
        grafo.addEdge(1., "João", "Creuza");
        grafo.addEdge(2., "Cráudio", "Lorenzo");
        grafo.addEdge(3., "Cráudio", "João");
        
    }
}