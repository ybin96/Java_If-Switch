package practice;

import java.util.Scanner;
class Exam05_If
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a;

		System.out.print("몇월입니까?");
		a = sc.nextInt();
		
		//만약에 1에서 12사이의 값이 아니면 프로그램을 멈추게 하고자한다.
		if(a < 1 || a > 12){
			System.out.println("입력오류");
			return; //여기서 돌아가라는 명령어
		}
		
		if(a >=3 && a <=5)
			System.out.println(a+"월은 봄입니다.");
		else if(a >=6 && a <=8)
			System.out.println(a+"월은 여름입니다.");
		else if(a >=9 && a <=11)
			System.out.println(a+"월은 가을입니다.");
		else
			System.out.println(a+"월은 겨울입니다.");
	
	}
}
