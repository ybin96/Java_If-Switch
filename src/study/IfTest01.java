package study;
/* 사용자한테 임의의 수 N을 입력받아 
   그 수가 양수이면 그 수에 100을 더한값을 출력
   그 수가 음수이면 그 수의 제곱을 출력하고 작업종료를 출력 */

import java.util.Scanner;
class IfTest01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double a;

		System.out.print("임의의 수를 입력하시오");
		a = sc.nextInt();

		if(a>=0){
			System.out.println(a+100);
		}else{
			System.out.println(a*a);
		}
		System.out.println("작업종료");
	}
}
