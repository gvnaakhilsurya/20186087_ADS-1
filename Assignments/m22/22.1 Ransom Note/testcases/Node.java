class Node {

	private String key;
	private Node nextnode;

	public String getKey(){
	  return key;
	}
	 
	public void setKey(String key){
	  this.key = key;
	}

	 public Node getNextnode(){
	  return nextnode;
	}
	 
	public void setNextnode(Node nextnode){
	  this.nextnode = nextnode;
	}

}

public class LinkedList {
    private Node start;
    private int size;

    LinkedList(int size) {
        this.size = 0;
        this.start = null;
    }
    LinkedList() {
        this.size = 0;
        this.start = null;
    }
}