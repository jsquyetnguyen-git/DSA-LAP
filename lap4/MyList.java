package lap4;

public class MyList {
	Node head, tail;

	public MyList() {
		head = tail = null;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void clear() {
		head=tail=null;
	}

	public void visitNode(Node x) {
		System.out.println(x.getData() + " ");
	}

	public void traverse() {
		Node p = head;
		while (p != null) {
			visitNode(p);
			p = p.getNextNode();
		}
	}

	public void addToLast(Person x) {
		Node newNode = new Node(x);
		if (isEmpty()) {
			head = tail = newNode;
			return;
		} else {
			tail.setNextNode(newNode);
			tail = newNode;
		}
	}

	public void addMany(int[] age, String[] name) {
		for (int i = 0; i < age.length; i++) {
			Person person = new Person(0, null);
			person.setName(name[i]);
			person.setAge(age[i]);
			addToLast(person);
		}
	}

	public void sort() {

		Node pi, pj;

		pi = head;

		while (pi != null) {
			pj = pi.getNextNode();
			while (pj != null) {
				int x = pi.getData().getName().compareTo(pj.getData().getName());
				if (x > 0) {
					Person temp = pi.getData();
					pi.setData(pj.getData());
					pj.setData(temp);
				}

				pj = pj.getNextNode();
			}

			pi = pi.getNextNode();
		}
		traverse();
	}

}
