package lap3;

public class MyList {
	Node head, tail;

	public MyList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void addToHead(int x) {
		Node newNode = new Node(x);

		if (isEmpty()) {
			head = newNode;
			return;
		} else {
			newNode.setNextNode(head);
			head = newNode;
		}
	}

	public void addToLast(int x) {
		Node newNode = new Node(x);

		if (isEmpty()) {
			head = tail = newNode;
			return;
		} else {
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}

	public void visitNode(Node x) {
		System.out.print(x.getData() + " ");
	}

	public void traverse() {
		Node x = head;

		while (x != null) {
			visitNode(x);
			x = x.getNextNode();
		}
	}

	public void search(int x) {
		int index = 0;
		Node y = head;
		while (y != null) {
			if (y.getData()>x) {
				System.out.print(index+" ");
			}
			index++;
			y = y.getNextNode();
		}
	}

}
