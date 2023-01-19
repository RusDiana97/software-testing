
public class Variables {

	public static void main(String[] args) {
		// Tipuri de date
		int number = 5; // declarare numar intreg
		String text = "course"; // declarare sir de caractere
		char letter = 'D'; // declarare o litera
		double doubleNumber = -0.9; // declarare numar cu virgula
		boolean test = true; // true sau fals
		
		if (doubleNumber >= 0) {
		System.out.println("This is my first testing " + text + "!");
		} else {
			System.out.println("My letter is " + letter);
		}
		
		// Array = matrice = colectie de elemente pe linii si coloane
		int[] arr = new int[5]; // array cu 5 elemente
		arr[0] = 5; // prima pozitie din array
		arr[1] = 4;
		arr[2] = 8;
		arr[3] = 11;
		arr[4] = 2;

		int[] arr2 = {1, 3, 3}; 
		// putem adauga ori cate elemente dorim in arr2 pentru ca 
		// nu am specificat lungimea array-ului ca in primul caz (arr[5])
		
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
	}

}
