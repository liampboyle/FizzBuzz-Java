/* *********************************************************************
 * Liam Boyle
 * 
 * Assignment:	Fizz Buzz soultion
 * Filename:	fizzbuzz.java
 *
 * Purpose:	"Write a program that prints the numbers from 1 to 100.
 * But for multiples of three print “Fizz” instead of the number and for
 * the multiples of five print “Buzz”. For numbers which are multiples
 * of both three and five print “FizzBuzz”."
 *
 * Compiled for:	Ubuntu Linux 11.10
 * Compiled with:	gcj 4.6.1
 * IDE:				Geany 0.20
 * 15 Jan 2012
 * *********************************************************************
 */

public class fizzbuzz
{
	public static void main(String[] args)
	{
		for (int i=1; i<=100; i++)
		{
			if (i%3==0 && i%5==0)
				System.out.println("FizzBuzz");
			else if (i%5==0)
				System.out.println("Buzz");
			else if (i%3==0)
				System.out.println("Fizz");
			else
				System.out.println(i);
		}
	}
}
