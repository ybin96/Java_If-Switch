package practice;

import java.util.Scanner;
public class Exam01_Switch
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String name,again;
		String star = "물병자리";
		int month = 0,day = 0;

		while(true)
		{
			System.out.print("이름을 입력하시오 : ");
			name = sc.next();

			boolean flag = true;
			while (flag){
				System.out.print("몇월에 태어났나요 : ");
				month = sc.nextInt();
				if (month >= 1 && month <= 12){
					flag = false;
				}
			} // end while 월 입력
			
			int last = 31;
			switch (month){
				case 4:case 6:case 9: case 11: last = 30;break;
				case 2: last = 28;
			}

			flag = true;
			while (flag){
				System.out.print("몇일에 태어났나요 : ");
				day = sc.nextInt();
				if (day >= 1 && day <= last){
					flag = false;
				}
			} // end while 일 입력

			switch (month){
				case 1:if(day<=19) star = "염소"; else star = "물병"; break;
				case 2:if(day<=18) star = "물병"; else star = "물고기"; break;
				case 3:if(day<=20) star = "물고기"; else star = "양"; break;
				case 4:if(day<=19) star = "양"; else star = "황소"; break;
				case 5:if(day<=20) star = "황소"; else star = "쌍둥이"; break;
				case 6:if(day<=21) star = "쌍둥이"; else star = "게"; break;
				case 7:if(day<=22) star = "게"; else star = "사자"; break;
				case 8:if(day<=22) star = "사자"; else star = "처녀"; break;
				case 9:if(day<=23) star = "처녀"; else star = "천칭"; break;
				case 10:if(day<=22) star = "천칭"; else star = "전갈"; break;
				case 11:if(day<=22) star = "전갈"; else star = "사수"; break;
				case 12:if(day<=24) star = "사수"; else star = "염소"; break;
			} // end switch
			System.out.println(name+"님의 별자리는 "+star+"자리 입니다.");
			
			flag = true;
			while (flag)
			{
				System.out.println("또 하시겠어요?(Y/N)");
				again = sc.next();
				if (again.equals("Y"))
				{
					flag = false;
				
				}
			
				if (again.equals("N")) // 참조자료형이 같은지 판별할 때에는 equals를 사용합니다.
				{
				break; // break는 탈출해서 그다음 명령어를 실행하지만 return은 끝마친다.
				}
			} // end while 다시하기

		System.out.println("종료되었습니다.");

		} // end main
	}
}// end class
