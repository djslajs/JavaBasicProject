import java.util.Scanner;

public class �ڹٸ޼ҵ�4_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ��� : ");
		int kor=scan.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		int eng=scan.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
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
	 *    �޼ҵ�
	 *    1) �Ѱ��� ��� ����
	 *       ========
	 *         �ڵ带 ��Ƽ� ó��
	 *    
	 *    2) �ݺ����� ������ ������ �� �ִ�
	 *    3) ������ ������ ������ �ִ�
	 *    4) �����̳� �߰��� �����ϴ�
	 *    
	 *    
	 *    
	 *    ==> ����� ==> ������ � ������� ��������
	 *    ==> �Է°� ==> �������� �޴���
	 *    
	 */
}
















