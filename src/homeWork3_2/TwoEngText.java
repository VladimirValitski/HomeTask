package homeWork3_2;

public class TwoEngText {
	/*
	 * In English text replace each letter of its serial number in alphabet
	 */
	public static void main(String[] args) {
		String engText = "Hello, My name is Vladimir!";
		String engTextOne = engText.trim();
		String engTextLower = engTextOne.toLowerCase(); // translate the text to lower case
		String engAlfabet = "abcdefghijklmnopqrstuvwxyz"; // create string of alphabet
		String[] wordForPrint = engTextOne.split(""); // create an array for print
		String[] word = engTextLower.split("");// translate into the working array text with lower case
		String[] wordNew = new String[word.length]; // create new array for numerical equivalents of letters
		for (int i = 0; i < word.length; i++) {
			char ch = word[i].charAt(0);
			if (Character.isLetter(ch)) { // check element for is it Letter?
				int index = engAlfabet.indexOf(word[i]) + 1; // find index of the letter in alphabet
				if (index < 10) { // conditions for the correct conclusion of the array
					wordNew[i] = String.valueOf(index) + "  ";
				} else
					wordNew[i] = String.valueOf(index) + " ";
			} else
				wordNew[i] = "   ";
			// String f = String.valueOf(engAlfabet.indexOf(word[i]));
		}
		for (String t : wordForPrint) { // print original string with double space
			System.out.print(t + "  ");
		}
		System.out.println();
		for (String r : wordNew) { // print new string
			System.out.print(r);
		}
	}
}
