package s106b;

public class MyList {
	private Node head;

	public void add(int value) {
		Node node = new Node(value);

		if (head == null) {
			head = node;
			return;
		}

		Node cur = head;
		Node next = cur.getNext();
		while (next != null) {
			cur = next;
		}
		cur.setNext(node);
	}

	public String ToString() {
		StringBuilder sb = new StringBuilder("[");
		Node cur = head;

		while (cur != null) {
			sb.append(cur);
			cur = cur.getNext();
		}
		sb.append("]");
		return sb.toString();

	}

	public int size(int value) {
		int count = 0;
		Node cur = head;
		while (cur != null) {
			count++;
		}
		return count;
	}

	public int get(int getindex) {
		int value = 0;
		int index = 0;
		Node cur = head;
		while (cur != null) {
			if (index <= getindex) {
				value = cur.getValue();
				cur = cur.getNext();
				index++;
			} else {
				cur = cur.getNext();
				index++;
			}
		}
		return value;
	}

}
