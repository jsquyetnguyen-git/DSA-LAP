package lap5;

public class MyStack {
	Node head;

	public MyStack() {
		head = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void traserve() {
		while (!isEmpty()) {
			System.out.print(pop());
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("Stack is empty!");
		}

		int x = head.getData();
		head = head.getNextNode();
		return x;
	}

	public void push(int x) {
		Node newNode = new Node(x);

		if (isEmpty()) {
			head = newNode;
			return;
		} else {
			newNode.setNextNode(head);
			head = newNode;
		}
	}

	public void convert(int x) {
		while (x!=0) {
			push(x % 2);
			x /= 2;
		}
	}

}
