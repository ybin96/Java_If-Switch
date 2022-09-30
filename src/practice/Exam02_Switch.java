package practice;

import java.util.Scanner;
public class Exam02_Switch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int user,com;
		String str_user="",str_com="";

		com = (int)(System.currentTimeMillis() % 3); //현재시간을 밀리시간으로 전환
		System.out.println("**컴퓨터와 가위바위보 게임하기**");
		System.out.print("가위:0, 바위:1, 보:2 = ");
		user = sc.nextInt();

		switch (user){
		case 0: str_user = "가위";break;
		case 1: str_user = "바위";break;
		case 2: str_user = "보";break;	
		}
		
		switch (com){
		case 0: str_com = "가위";break;
		case 1: str_com = "바위";break;
		case 2: str_com = "보";break;	
		}
		System.out.println("사용자 : "+ str_user);
		System.out.println("컴퓨터 : "+ str_com);
		
		if (user == com)
			System.out.println("비겼습니다");
		else if ((user==0 && com==2) || (user==1 && com==0) || (user==2 && com==1) )
			System.out.println("당신이 이겼습니다");
		else
			System.out.println("컴퓨터가 이겼습니다");
	}
}
