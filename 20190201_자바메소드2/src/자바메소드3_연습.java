import java.util.Scanner;

public class �ڹٸ޼ҵ�3_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor=scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng=scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int math=scan.nextInt();
		int total=sum(kor, eng, math);
		double avg=avg(total);
		
		print(total, avg);
		
	}
	
	static int score()
	{
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		return a;
	}
	
	static int sum(int a, int b, int c)
	{
		return a+b+c;
	}
	
	static double avg(int total)
	{
		return total/3.0;
	}
	
	static void print(int total, double avg) 
	{
		System.out.println("���� : "+ total);
		System.out.println("��� : "+ avg);
	}
	
}

