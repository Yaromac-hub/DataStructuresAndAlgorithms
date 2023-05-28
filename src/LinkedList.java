public class LinkedList {

    public Node head;

    public LinkedList() {
        this.head = null;
    }

    public void addToHead(String data){
        Node newHead = new Node(data);
        Node currentHead = head;
        this.head = newHead;
        if(head!=null){
            head.setNextNode(currentHead);
        }
    }

    public void addToTail(String data){
        Node tail = head;
        if(tail==null){
            head = new Node(data);
        }
        else{
            while(tail.getNextNode()!=null){
                tail=tail.getNextNode();
            }
            tail.setNextNode(new Node(data));
        }
    }



    public String printList(){
        String output = "<head> ";
        Node currentNode = head;
        while(currentNode!=null){
            output+=currentNode.data+" ";
            currentNode = currentNode.getNextNode();
        }
        output+="<tail>";
        System.out.println(output);
        return output;
    }

    public void addToHead(String key, String value) {
        Node newHead = new Node(key, value);
        Node currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNode(currentHead);
        }
    }

    public void addToTail(String key, String value) {
        Node tail = this.head;
        if (tail == null) {
            this.head = new Node(key, value);
        } else {
            while (tail.getNextNode() != null) {
                tail = tail.getNextNode();
            }
            tail.setNextNode(new Node(key, value));
        }
    }

    public String removeHead() {
        Node removedHead = this.head;
        if (removedHead == null) {
            return "";
        }
        this.head = removedHead.getNextNode();
        return "";
    }

    public static void main(String[] args){
        LinkedList testList = new LinkedList();
        testList.addToHead("five");
        testList.addToTail("four");
        testList.addToTail("six");
        testList.addToHead("one");
        testList.printList();
    }
}
