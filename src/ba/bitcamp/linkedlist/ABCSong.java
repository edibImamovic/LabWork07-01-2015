package ba.bitcamp.linkedlist;

public class ABCSong {
	public static void main(String[] args) {

		Truck[] alphabet = new Truck[26];
		Engine eng = new Engine("Alphabet");
		Train abc = new Train(eng); // Train object, simply pointing to engine.

		int alphaCharNumber = 65;

		// Loop for adding whole alphabet characters into our train
		for (int i = 0; i < 26; i++) {
			alphabet[i] = new Truck((char) alphaCharNumber); // Converting
																// numbers into
																// characters by
																// ASCII table.
			alphaCharNumber++; // Moving counter to next letter.
		}

		eng.attach(alphabet[0]); // Attaching first truck to engine

		// For loop for attaching
		for (int i = 1; i < alphabet.length; i++) {
			alphabet[i - 1].attach(alphabet[i]); // attaching method which
													// attach next truck.
		}

		sing(abc);

	}

	/**
	 * Sing method printing all characters in our train.
	 * 
	 * @param abc
	 *            Train made of alphabet trucks.
	 */
	public static void sing(Train abc) {
		Truck current = abc.getEngine().getFirst(); // Getting first truck in
													// our train. First we get
													// engine and then from
													// engine we get first
													// truck.

		// Loop where we print all letters while our current truck is not null.
		// That means that our truck is created object.
		while (current != null) {
			System.out.print(current.toString() + " ");
			current = current.getNext(); // Moving counter to next truck.
		}
	}
}