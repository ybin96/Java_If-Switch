package practice;

import java.util.Scanner;
class Exam04_If
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a;
		System.out.print("0~9사이의 수를 입력하시오 : ");
		a = sc.nextInt();

		if(a==0)
			System.out.println("영");
		else if (a==1)
			System.out.println("일");
		else if (a==2)
			System.out.println("이");
		else if (a==3)
			System.out.println("삼");
		else if (a==4)
			System.out.println("사");
		else if (a==5)
			System.out.println("오");
		else if (a==6)
			System.out.println("육");
		else if (a==7)
			System.out.println("칠");
		else if (a==8)
			System.out.println("팔");
		else if (a==9)
			System.out.println("구");
		else
			System.out.println("입력오류");
	}
}
