package com.flowControl;

public class FallThroughInsideSwitch {
//	With in the switch statement if any case is matched from that case onwards all
//	statements will be executed until end of the switch (or) break. This is call "fall-through"
//	inside the switch .

//	The main advantage of fall-through inside a switch is we can define common action for
//	multiple cases

	public static void main(String[] args) {
		int x = 0;
		switch (x) {
//		case 1:
//			System.out.println("0");
		case 0:
			System.out.println("0");
		case 2:
			System.out.println("1");
		case 3:
			System.out.println("2");
		default:
			System.out.println("default");
//		==>>	With in the switch we can take the default only once
//		==>>	If no other case matched then only default case will be executed
//		==>>	 With in the switch we can take the default any where, but it is convension to take
//		==>>	default as last case.
		}

		int y = 0;
		switch (x) {
		default:
			System.out.println("defaulttt");
		case 0:
			System.out.println("00");
			break;
		case 2:
			System.out.println("11");
		case 3:
			System.out.println("22");

		}
	}

}
