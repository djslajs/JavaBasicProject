import java.util.Scanner;

public class 자바메소드4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//학점
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int kor=scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng=scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int math=scan.nextInt();
		
		//학점 출력
		
		char score='A';
		switch(kor/10)
		{
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
			break;
		}
		System.out.println(kor + " : "+ score);
		
		switch(eng/10)
		{
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
			break;
		}
		
		System.out.println(kor + " : "+ score);
		
		switch(math/10)
		{
		case 10:
		case 9:
			score='A';
			break;
		case 8:
			score='B';
			break;
		case 7:
			score='C';
			break;
		case 6:
			score='D';
			break;
		default:
			score='F';
			break;
		}
		System.out.println(kor + " : "+ score);
	}

}
