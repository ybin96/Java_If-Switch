package study;

public class CompoundTest
{
	public static void main(String[] args) 
	{
		int i = 0;
		int sum = 0;

		i++;
		sum += i; //sum = sum + i 

		i++;
		sum += i;

		i++;
		sum += i;

		System.out.println(i);
		System.out.println(sum);
	}
}
