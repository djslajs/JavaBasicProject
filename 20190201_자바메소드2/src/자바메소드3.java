import java.util.Scanner;

public class �ڹٸ޼ҵ�3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ����, ����, ���� ������ �Է¹޾Ƽ� ����, ���
		
		//System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor=scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng=scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int math=scan.nextInt();
		
		int total= kor+eng+math;
		double avg=total/3.0;
		System.out.println("���� : "+ total);
		System.out.println("��� : "+ avg);

	}

}
