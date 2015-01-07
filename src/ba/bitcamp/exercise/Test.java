package ba.bitcamp.exercise;

public class Test {

	public static void main(String[] args) {
		LinkedListInt test = new LinkedListInt();
		test.add(1);
		test.add(2);
		test.add(3);
		test.add(4);
		System.out.println("Poslije brisanja: ");
		test.printList();
		LinkedListInt test2 = new LinkedListInt();
		test2.add(4);
		test2.add(5);
		test2.add(6);
		test2.add(7);
		test2.printList();
		
		test2.add(test);
		System.out.println("Nakon dodavanja");
		test2.printList();
		

	}

}
