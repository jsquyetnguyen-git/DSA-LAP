package lap4;

public class Node {
	private Person data;
	private Node nextNode;

	public Node(Person data) {
		this(data, null);
	}

	public Node(Person data, Node nextNode) {
		super();
		this.data = data;
		this.nextNode = nextNode;
	}

	public Person getData() {
		return data;
	}

	public void setData(Person data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
	

}
