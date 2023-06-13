import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private boolean isWeighted;
    private boolean isDirected;

    public Graph() {
        this.vertices = new ArrayList<Vertex>();
    }

    public ArrayList<Vertex> getVertices() {
        return this.vertices;
    }

    public Vertex getVertexByValue(String value) {
        for(Vertex v: this.vertices) {
            if (v.getData() == value) {
                return v;
            }
        }

        return null;
    }

    public void print() {
        for(Vertex v: this.vertices) {
            v.print(isWeighted);
        }
    }

    public Vertex addVertex(String data){
        Vertex vertex = new Vertex(data);
        this.vertices.add(vertex);
        return vertex;
    }

    public static void main(String[] args) {
        Graph trainNetwork = new Graph();
        Vertex atlantaStation = trainNetwork.addVertex("Atlanta");
        Vertex newYorkStation = trainNetwork.addVertex("New York");
        trainNetwork.print();
    }
}
