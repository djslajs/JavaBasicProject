import java.util.Scanner;

public class 자바메소드3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 국어, 영어, 수학 점수를 입력받아서 총점, 평균
		
		//System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("국어 점수를 입력하세요 : ");
		int kor=scan.nextInt();
		System.out.println("영어 점수를 입력하세요 : ");
		int eng=scan.nextInt();
		System.out.println("수학 점수를 입력하세요 : ");
		int math=scan.nextInt();
		
		int total= kor+eng+math;
		double avg=total/3.0;
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ avg);

	}

}
