import java.util.Scanner;

public class 자바메소드3_연습 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int kor=scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng=scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
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
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ avg);
	}
	
}

