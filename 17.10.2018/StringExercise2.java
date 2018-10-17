package stringExercises;

public class StringExercise2 {

	public static void main(String[] args) {
		System.out.println(removeDuplicateChars("the quick brown fox","queen"));
		
	}
	
	public static String removeDuplicateChars(String givenString, String stringOfDuplicates) {
		char[] stringOfChars = givenString.toCharArray();
		for (int i = 0; i < givenString.length(); i++) {
			for (int j = 0; j < stringOfDuplicates.length(); j++) {
				if (givenString.charAt(i) == stringOfDuplicates.charAt(j)) {
					stringOfChars[i] = ' ';
				}
			}			
		}
		return String.copyValueOf(stringOfChars);
	}

}
