package de.justinharder.aoc.d01;

public class Product
{
	private Product() {}

	public static int of(int number1, int number2)
	{
		return number1 * number2;
	}

	public static int of(int number1, int number2, int number3)
	{
		return of(number1, number2) * number3;
	}
}
