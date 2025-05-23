package com.java8example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ClothShowroom {
	public static List<String> sizelist = Arrays.asList("S", "M", "L", "XL");

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter type : ");
		String shirtType = scanner.next();
		System.out.println("Enter category : ");
		String category = scanner.next();

		List<ClothInfo> infos = Arrays.asList(new ClothInfo("C1", "shirt", "M", "men"),
				new ClothInfo("C2", "TShirt", "XL", "men"), new ClothInfo("C3", " Tshirt", "M", "women"),
				new ClothInfo("C4", "shirt", "s", "men"), new ClothInfo("C5", "jeans", "M", "men"),
				new ClothInfo("C6", "Shirt", "L", "men"), new ClothInfo("C7", "Tshirt", "M", "women"));

		List<ClothInfo> rack = infos.stream()
				.filter(c -> c.type.equalsIgnoreCase(shirtType) && c.category.equalsIgnoreCase(category))
				.sorted(Comparator.comparingInt(c -> sizelist.indexOf(c.size))).collect(Collectors.toList());

		for (ClothInfo clothInfo : rack) {
			System.out.println(clothInfo);
		}
		scanner.close();
	}
}

class ClothInfo {
	String code;
	String type;
	String size;
	String category;

	public ClothInfo(String code, String type, String size, String category) {
		this.code = code;
		this.type = type;
		this.size = size;
		this.category = category;
	}

	@Override
	public String toString() {
		return "ClothInfo [code=" + code + ", type=" + type + ", size=" + size + ", category=" + category + "]";
	}

}
