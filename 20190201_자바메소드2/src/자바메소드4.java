import java.util.Scanner;

public class �ڹٸ޼ҵ�4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		Scanner scan=new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ��� : ");
		int kor=scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int eng=scan.nextInt();
		System.out.println("���� ������ �Է��ϼ��� : ");
		int math=scan.nextInt();
		
		//���� ���
		
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
