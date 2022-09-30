package study;

import java.util.Scanner;
public class SwitchTest
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int month,last;
		System.out.print("월을 입력하시오 : ");
		month = sc.nextInt();

		if(month > 12 || month < 1){
			System.out.println("입력오류");
			return;
		}

		switch (month){
			case 2: 
				last = 28;
				break;
			case 4:case 6:case 9:case 11: 
				last = 30;
				break;
			default:
				last = 31;
				break;
		}
		System.out.println(month+"월은 "+last+"일까지 있어요.");
	}
}
