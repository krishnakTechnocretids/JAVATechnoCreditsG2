package soumya;

import java.util.Scanner;

public class AllDifferIndex_Service {
	int arrOne[], arrTwo[];
	int size;

	// Method for getting input from user
	void InputOutput() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total number of elements in an array: ");
		size = sc.nextInt();
		arrOne = new int[size];
		arrTwo = new int[size];

		System.out.println("Enter elements in first array: ");
		for (int index = 0; index < arrOne.length; index++) {
			arrOne[index] = sc.nextInt();
		}
		System.out.println("Enter elements in second array: ");
		for (int index = 0; index < arrOne.length; index++) {
			arrTwo[index] = sc.nextInt();
		}
		sc.close();
	}

	// Method for comparing two arrays
	void compare() {
		boolean flag = false;
		for (int index = 0; index <= arrTwo.length - 1; index++) {
			if (arrOne[index] == arrTwo[index]) {
				flag = true;
			} else {
				flag = false;
				if (flag == true) {
					System.out.println("Values are matching at index-> " + index);
				} else {
					System.out.println("Values are not matching at index-> " + index);
				}
			}
		}
	}
}
