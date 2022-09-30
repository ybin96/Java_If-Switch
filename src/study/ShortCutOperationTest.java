package study;

public class ShortCutOperationTest
{
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 5;
		//if( ++a >= 10 && ++b >= 10 ){
		if( ++a >= 10 & ++b >= 10 ){
			System.out.println("OK");
		}else{
			System.out.println("NO");
		}
		System.out.println("a="+a);  // &&일때 6, &일때 6
		System.out.println("b="+b);  // &&일때 5, &일때 6
	}
}
