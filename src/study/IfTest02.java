package study;

import java.util.Scanner;
public class IfTest02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a;

		System.out.print("월을 입력하세요 : ");
		a = sc.nextInt();

		if (a<1 || a>12)
		{
			System.out.println("입력오류"); 
			return ;
		}
		
		if (a==1||a==3||a==5||a==7||a==8||a==10||a==12)
			System.out.println(a+"월은 31일까지 있어요!");
		else if (a==2)
			System.out.println(a+"월은 28일까지 있어요!");
		else
			System.out.println(a+"월은 30일까지 있어요!");
	}
}
