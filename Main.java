public class Main {

	public static void main(String[] args) {

		List l = new List();

		l.add(3);
		l.add(23);
		l.add(212);
		l.add(70);
		l.add(2);
		l.add(4);

		l.print();
		System.out.printf("get(6): %d\n", l.get(6));
		l.remove(6);
		System.out.println();
		l.print();
	}

}
