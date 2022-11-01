package com.bridgelab.day3.array;

public class PrintDuplicateElement {
	public static void main(String[] args) {
		int array[] = { 11, 2, 3, 5, 1, 11, 2, 3, 5, 4 };
		System.out.println("Duplicate Array Element :");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					System.out.print(array[j] + " ");
				}
			}
		}
	}

}
