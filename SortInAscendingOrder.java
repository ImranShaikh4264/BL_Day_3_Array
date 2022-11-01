package com.bridgelab.day3.array;

public class SortInAscendingOrder {
	public static void main(String[] args) {
		int temp = 0;
		System.out.println("Array Element :");
		int array[] = { 10,50,70,60,80,20};

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		System.out.println();

		System.out.println("\nAscending order array Element :");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		}

}
