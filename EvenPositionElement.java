package com.bridgelab.day3.array;

public class EvenPositionElement {
	public static void main(String[] args) 
	{
		int array[] = { 10,20,30,40,50,60,70,80,90 };
		System.out.println("Print Even Postion of Array :");
		for (int i = 1; i < array.length; i = i + 2) 
		{
			System.out.print(array[i] + " ");
		}
		
	}
}
