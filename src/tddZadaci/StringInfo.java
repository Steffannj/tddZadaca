package tddZadaci;

public class StringInfo {
	
	public int getLength(String str) {
		return str.length();
	}
	
	public String getEvenChars(String str) {
		String evenChars = "";
		for (int i = 0; i < str.length(); i+=2) {
			if(str.charAt(i) != ' ') {
				evenChars += str.charAt(i);
			}
		}
		return evenChars;
	}
	
	public String getOddChars(String str) {
		String oddChars = "";
		for (int i = 1; i < str.length(); i+=2) {
			if(str.charAt(i) != ' ') {
				oddChars += str.charAt(i);
			}
		}
		return oddChars;
	}
	
	public int getNumOfUppercase(String str) {
		int num = 0;
		
		for (int i = 0; i < str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				num++;
			}
		}
		return num;
	}

	public int getNumOfLowercase(String str) {
		int num = 0;
	
		for (int i = 0; i < str.length(); i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				num++;
			}
		}
		return num;
	}
	
	public String getCharsThatAreNotLetters(String str) {
		String notLetters = "";
		
		for (int i = 0; i < str.length(); i++) {
			if(!Character.isLetter(str.charAt(i)) && str.charAt(i) != ' ') {
				notLetters += str.charAt(i);
			}
		}
		return notLetters;
	}
}
