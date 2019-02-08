// 사용자 입력 ==> 100 ==> 1~100까지 누적된 합

import java.util.Scanner;

public class 자바메소드5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("1~100까지 사이의 정수를 입력하세요 : ");
//		int num=scan.nextInt();
//		
//		int sum=0;
//		for(int i=1; i<=num; i++)
//		{
//			sum+=i;
//		}
//		
//		System.out.println("1~"+num+"까지의 합 : " + sum);
		process();
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("1~100까지 사이의 정수를 입력하세요 : ");
		int num=scan.nextInt();
		int sum=sum(num);
		System.out.println("1~"+num+ "까지의 합 : " + sum);
	}


	static int sum(int num)
	{
		int sum=0;
		for(int i=1; i<=num; i++)
		{
			sum+=i;
		}
		return sum;
	}
}
