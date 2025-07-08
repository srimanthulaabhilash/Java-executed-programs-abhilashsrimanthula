package com.example;

public class Demo {

	public static void main(String[] args) {
		String str = "abababababababababc";
		String target = "ab";
		int count = 0;

		for (int i = 0; i < str.length() - target.length(); i++) {
			boolean val = true;
			for (int j = 0; j < target.length(); j++) {
				if (str.charAt(i + j) != target.charAt(j)) {
							System.out.println(str.charAt(i+j));
//							System.out.println(target.charAt(j));
					val = false;
					break;
					// count++;
				}
			}

			if (val) {
				count++;
			}

		}
//		System.out.println(count);

	}

}
