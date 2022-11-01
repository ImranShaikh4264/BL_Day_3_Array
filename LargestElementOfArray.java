package com.bridgelab.day3.array;

public class LargestElementOfArray {
	public static void main(String[] args) {
		int[] array = new int[] { 10,20,30,50,20 };
		int large = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > large) {
				large = array[i];
			}
		}
		System.out.println("Largest element of Array  : " + large);

	}
}
