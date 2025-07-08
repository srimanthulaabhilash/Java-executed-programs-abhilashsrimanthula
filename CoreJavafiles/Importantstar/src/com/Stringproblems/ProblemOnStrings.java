package com.Stringproblems;

public class ProblemOnStrings {
	public static void reverseString(String Name) {
		String emptyStr = "";
//		StringBuilder builder = new StringBuilder();
		for (int i = Name.length() - 1; i >= 0; i--) {
			emptyStr = emptyStr + Name.charAt(i);
//			builder.append(Name.charAt(i));
		}
		if (emptyStr.equalsIgnoreCase(Name)) {
//			System.out.println("stringpalindrome");
		} else {
//			System.out.println("not");
		}

	}

	static void reverse(String name) {
		StringBuilder builder = new StringBuilder(name);
		String string = builder.reverse().toString();
		if (name.equalsIgnoreCase(string)) {
//			System.out.println("stringpalindrome");
		}
	}

	static void sumOfNatural(int n) {
		int t = 0;
		for (int i = 0; i <= n; i++) {
			t += i;
		}
//		System.out.println(t);
	}

	static void vowelsAndConstants(String string) {
		int vcount = 0;
		int ccount = 0;
		String vowels = "";
		String conatants = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
					|| string.charAt(i) == 'u') {
				vcount = vcount + 1;
				vowels += string.charAt(i);
			} else {
				ccount = ccount + 1;
				conatants += string.charAt(i);
			}
		}
//		System.out.println(vowels + "  vowels count is :" + vcount);
//		System.out.println(conatants + "" + "  consonents count is :" + ccount);
	}

	static void nonrepeatinChar(String charcter) {
		for (int i = 0; i < charcter.length() - 1; i++) {
			char c = charcter.charAt(i);
			System.out.println(c);

			if (charcter.indexOf(i) == charcter.indexOf(i)) {
				System.out.println(charcter);

			}
		}

	}

	public static void main(String[] args) {
		reverseString("Abhilash");
		reverse("madam");
		sumOfNatural(22);
		vowelsAndConstants("abcdef");
		nonrepeatinChar("swiss");
	}

}
