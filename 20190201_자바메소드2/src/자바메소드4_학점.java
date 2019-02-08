import java.util.Scanner;

public class 자바메소드4_학점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요 : ");
		int kor=scan.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		int eng=scan.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		int math=scan.nextInt();
		
		char k=hakjum(kor);
		char e=hakjum(eng);
		char m=hakjum(math);
		
		System.out.println(kor + " : "+ k);
		System.out.println(eng + " : "+ e);
		System.out.println(math + " : "+ m);
	}
	
	static char hakjum(int jumsu)
	{
		char score='A';
		switch(jumsu/10)
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
		return score;
	}
	
	/*
	 * 
	 *    메소드
	 *    1) 한개의 기능 수행
	 *       ========
	 *         코드를 모아서 처리
	 *    
	 *    2) 반복적인 수행을 방지할 수 있다
	 *    3) 재사용의 목적을 가지고 있다
	 *    4) 수정이나 추가가 용이하다
	 *    
	 *    
	 *    
	 *    ==> 결과값 ==> 수행후 어떤 결과값이 나오는지
	 *    ==> 입력값 ==> 무슨값을 받는지
	 *    
	 */
}
















