package practice;

import java.util.Scanner;
public class Exam01_If
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String name, result;
		int age;
		double height;

		System.out.print("이름을 입력하시오 : ");
		name = sc.next();
		System.out.print("나이을 입력하시오 : ");
		age = sc.nextInt();
		System.out.print("키를 입력하시오 : ");
		height = sc.nextDouble();

		if( (age <= 30 && age >= 20) & height >= 165 ){
			System.out.println(name+"님 입장가능");
		}else{
			System.out.println(name+"님 입장불가능");
		}
	}
}
