public class Node {

    public String data;
    private Node next;
    private Node previous;
    public String key;
    public String value;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public Node(String key, String value) {
        this.key  = key;
        this.value = value;
        this.next = null;
    }

    public void setKeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public void setNextNode(Node node) {
        this.next = node;
    }

    public void setPreviousNode(Node node) {
        this.previous = node;
    }

    public Node getNextNode() {
        return this.next;
    }

    public Node getPreviousNode() {
        return this.previous;
    }

}