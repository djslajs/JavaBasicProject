// ����� �Է� ==> 100 ==> 1~100���� ������ ��

import java.util.Scanner;

public class �ڹٸ޼ҵ�5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner scan=new Scanner(System.in);
//		System.out.println("1~100���� ������ ������ �Է��ϼ��� : ");
//		int num=scan.nextInt();
//		
//		int sum=0;
//		for(int i=1; i<=num; i++)
//		{
//			sum+=i;
//		}
//		
//		System.out.println("1~"+num+"������ �� : " + sum);
		process();
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("1~100���� ������ ������ �Է��ϼ��� : ");
		int num=scan.nextInt();
		int sum=sum(num);
		System.out.println("1~"+num+ "������ �� : " + sum);
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
