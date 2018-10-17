package stringExercises;

public class StringExercise1 {

	public static void main(String[] args) {
		String theString = "abcdefghijklmnopqrstuvwxy";
		stringDivider(5,theString);
	}
	
	public static void stringDivider(int numberOfStrings, String theString) {
		int newStringLength = theString.length()/numberOfStrings;
		if (theString.length()%numberOfStrings != 0)
			return;
		for (int i = 0; i < theString.length(); i+=newStringLength) {
			System.out.println(theString.substring(i,i+newStringLength));
		}
	}

}
