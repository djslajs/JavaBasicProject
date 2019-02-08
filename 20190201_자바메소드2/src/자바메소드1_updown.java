//dlskflskjflakjlkdf

import java.util.Scanner;

public class 자바메소드1_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	
	static void process()
	{
		
		Scanner scan=new Scanner(System.in);
		int com=com();
		//System.out.println(com);
		while(true)
		{
			
			int user=user();
			String res=compare(user,com);
			
			if(user<1 || user>100)
			{
				System.out.println("1~100 사이의 정수를 입력하시오");
				//while문 조건식으로 이동
				continue;
			}
			
			if(res.equals("OK"))
			  {
				/*
				 * System.out.println("종료할까요?(Y,N):"); String s=scan.next();
				 * 
				 * if(s.equalsIgnoreCase("n")); { process(); // 재귀호출 } else {
				 * System.out.println("종료합니다!!"); System.exit(0); // }
				 */
				  break;
				  
			  }
		}
	}
	
	//난수 발생
	static int com()
	{
		
		return (int)(Math.random()*100)+1;
	}
	
	//사용자 입력
	static int user()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("1~100 사이의 정수를 입력하시오: ");
		int user=scan.nextInt();
		return user;
	}
	
	//힌트
	static String compare(int user, int com)
	{
		String res="";
		
		if(com>user)
		{
			System.out.println("Up!");
			res="UP!";
		}
		else if(com<user)
		{
			System.out.println("Down!");
			res="Down!";
		}
		else
		{
			// 종료여부
			System.out.println("정답입니다!");
			res="OK";
		}
		
		return res;
	}

}
