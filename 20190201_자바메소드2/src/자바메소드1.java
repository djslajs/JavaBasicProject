

/*
 * 
 *    데이터 묶기
 *    =========> 배열(관련된 데이터 => 같은 데이터만 묶어서 사용할 수 있다)
 * 
 */

/*데이터를 묶어서 사용 가능 ==> 클래스(사용자 정의 데이터형)
class Movie
{
	
	int code;
	String title;
	String poster;
	String director;
	String actor;
	String genre;
	String grade;
	String story;
	
}*/

/*
 * 
 *    요구사항 분석(벤치마킹)
 *       = 아이템
 *       = 기능 찾기
 *    =================
 *    설계 : 변수 설정 => 데이터 수집
 *                    ======== File, Oracle(저장 방식)
 *          화면 UI 만들기
 *          
 *          데이터 출력
 *          
 *          테스팅
 *          
 *          배포(발표)
 *    ================= NCS
 * 
 */

// UPDOWN게임

import java.util.Scanner;

public class 자바메소드1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 난수발생 1~100
		int com=(int)(Math.random()*100)+1;
		
		
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			//사용자입력
			System.out.println("1~100 사이의 정수를 입력하시오");
			int user=scan.nextInt();
			
			if(user<1 || user>100)
				{
				System.out.println("1~100 사이의 정수를 입력하시오");
				//while문 조건식으로 이동
				continue;
				}
				
			// 힌트
			if(com>user)
			{
				System.out.println("Up!");
			}
			else if(com<=user)
			{
				System.out.println("Down!");
			}
			else
			{
				// 종료여부
				System.out.println("정답입니다!");
				break;
			}
		}
	}
}
