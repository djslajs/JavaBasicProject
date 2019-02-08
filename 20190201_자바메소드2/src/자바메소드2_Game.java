import java.util.Scanner;

public class 자바메소드2_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	
	static void process()
	{
		int[] com=ran();
		
		Scanner scan=new Scanner(System.in);
		int[] user= new int[3];
		
		
	}

	//난수
	static int[] ran()
	{
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
		
		return com;
	}
	
	//사용자입력
	static int[] input()
	{
		Scanner scan=new Scanner(System.in);
		//사용자가 입력한 데이터 저장하는 공간
		int[] user= new int[3];
		int input=scan.nextInt();
		
		//3자리 정수 => 배열에 저장
		user[0]=input/100;
		user[1]=(input%100)/10;
		user[2]=input%10;
		
		return user;
			
	}
	
	
	//비교 s
	static void compare(int[] com, int[] user)
	{
		
		
	}
	
	
}
