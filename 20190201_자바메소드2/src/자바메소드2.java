// 입력
/*
 * 
 *    숫자 야구게임
 *    1) 난수 발생
 *    2) 사용자 발생
 *    3) 비교
 *    4) 힌트
 *    5) 종료
 * 
 * 
 */

import java.util.Scanner;

public class 자바메소드2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//난수
		int[] com=new int[3];
		//중복없는 난수
		int su=0;//난수 저장 변수
		boolean bCheck=false;
		for(int i=0; i<3; i++)
		{
			//중복여부 확인
			bCheck=true;
			while(bCheck)
			{
				//난수 발생
				 su=(int)(Math.random()*9)+1; //1~9사이의 정수
				 // while문 종료
				 bCheck=false;
				 
				 for(int j=0; j<3; j++)
				 {
					 if(com[j]==su)
					 {
						 //while문 다시 수행
						 bCheck=true;
						 break; //for => while 조건식으로 이동
					 }
				 }
			}
			com[i]=su;
		}
		//사용자 입력
		Scanner scan=new Scanner(System.in);
		//사용자가 입력한 데이터 저장하는 공간
		int[] user= new int[3];
		while(true)
		{
			System.out.println("3자리 정수를 입력하세요  : ");
			int input=scan.nextInt();
			
			if(input<1 ||input>1000)
			{
				System.out.println("3자리 정수가 아닙니다! 다시 입력하세요 : ");
				continue; //while문의 조건식으로 이동
			}
			
			//3자리 정수 => 배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//오류 처리 1) 0이 존재하면 안된다, 2) 같은 수를 저장하면 안된다
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0을 사용할수 없습니다");
				continue;
			}
			
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
			{
				System.out.println("중복된 수는 사용할 수 없습니다");
				continue;
			}
			
			//비교
			int s=0, b=0;
			for(int i=0; i<3; i++)//com[i]
			{
				for(int j=0; j<3; j++)//user[i]
				{
					if(com[i]==user[j])// 같은 수가 있는 경우 
					{
						if(i==j)//같은 자리가 있는경우
						{
							s++;
						}
						else
						{
							b++;
						}
					}
				}
			}
			System.out.printf("Input Number : %d, Result:%dS-%dB\n",input, s,b);
			
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
			
		}
	}

}










