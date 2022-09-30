package study;

public class BitTest 
{
	public static void main(String[] args) 
	{
		int a = 7;             // a = ...000111 
		int b = 10;			   // b = ...001010
		int i = a & b;
		int j = a | b;
		int k = a ^ b;

		System.out.println(i); // 2
		System.out.println(j); // 15
		System.out.println(k); // 13
	}
}
