package com.bridgelab.day3.array;

public class SmallestElementOfArray {
	public static void main(String[] args) {
		int[] array = new int[] { 20,30,10,30,50 };
		int small = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] < small) {
				small = array[i];
			}
		}
		System.out.println("Largest element of Array  : " + small);
	}

}
