package practice;

import java.util.Scanner;
public class Exam06_If
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b,c; //int max;
		System.out.print("첫번째 정수를 입력하시오 :");
		a = sc.nextInt();
		System.out.print("두번째 정수를 입력하시오 :");
		b = sc.nextInt();
		System.out.print("세번째 정수를 입력하시오 :");
		c = sc.nextInt();

		if(a>b)
			if(a>c)
				System.out.println("가장큰수는 "+a+" 입니다.");
		        //max = a;
			else
				System.out.println("가장큰수는 "+c+" 입니다."); 
			    //max = c;
		else
			if(b>c)
				System.out.println("가장큰수는 "+b+" 입니다."); 
		        //max = b;
			else
				System.out.println("가장큰수는 "+c+" 입니다."); 
			    //max = c;

		// System.out.println("가장큰수는 "+max+" 입니다.");
	}
}