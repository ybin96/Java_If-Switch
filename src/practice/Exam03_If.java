package practice;

import java.util.Scanner;
class Exam03_If
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int qty;
		int price = 200;

		System.out.print("구매수량을 입력하시오 : ");
		qty = sc.nextInt();

		int amount = price*qty;
		int discount = 0;

		if(qty >=10 ){
			discount = (int)(amount * 0.1);
		}
		int payment = amount - discount;
		System.out.println("물건의 단가" + price );
		System.out.println("구매수량" + qty );
		System.out.println("할인금액" + discount );
		System.out.println("지불금액" + payment );
	}
}
