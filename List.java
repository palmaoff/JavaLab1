public class List {

	private Node Head = null;

	public boolean isEmpthy() {
		if (Head == null) {
			return true;
		}

		return false;
	}

	// добавление
	public void add(int data) {
		Node n = new Node();
		n.data = data;
		n.next = null;

		if (isEmpthy()) {
			Head = n;
		}
		else {
			Node curr = Head;

			while (curr.next != null) {
				curr = curr.next;
			}

			curr.next = n;
		}
	}

	// извлечение по индексу
	public int get(int index) {
		int i = 1;
		Node curr = Head;

		while (i != index && curr != null) {
			curr = curr.next;
			i++;
		}

		if (index == i && curr != null) {
			return curr.data;
		}

		return 0;
	}

	// удаление по индексу
	public void remove(int index) {
		if (index == 1) {
			Head = Head.next;
		}
		else {
			index--;
			int i = 1;
			Node curr = Head;
			
			while (i != index && curr != null) {
				curr = curr.next;
				i++;
			}
			
			if (index == i && curr != null && curr.next != null) {
				curr.next = curr.next.next;
			}
		}
	}

	// удаление всего списка
	public void remove() {Head = null;}

	// вывод в консоль
	public void print() {
		Node curr = Head;

		while (curr != null) {
			System.out.println(curr.data);
			curr = curr.next;
		}
	}

}
