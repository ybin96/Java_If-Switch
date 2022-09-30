package practice;

import java.util.Scanner;
class Exam02_If
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b,max;

		System.out.println("첫번째 정수를 입력하시오");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력하시오");
		b = sc.nextInt();
		max = (a>b)?a:b;
		System.out.println("둘중 큰수는 : "+max);
	}
}
	