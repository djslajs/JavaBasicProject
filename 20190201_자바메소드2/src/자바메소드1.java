

/*
 * 
 *    ������ ����
 *    =========> �迭(���õ� ������ => ���� �����͸� ��� ����� �� �ִ�)
 * 
 */

/*�����͸� ��� ��� ���� ==> Ŭ����(����� ���� ��������)
class Movie
{
	
	int code;
	String title;
	String poster;
	String director;
	String actor;
	String genre;
	String grade;
	String story;
	
}*/

/*
 * 
 *    �䱸���� �м�(��ġ��ŷ)
 *       = ������
 *       = ��� ã��
 *    =================
 *    ���� : ���� ���� => ������ ����
 *                    ======== File, Oracle(���� ���)
 *          ȭ�� UI �����
 *          
 *          ������ ���
 *          
 *          �׽���
 *          
 *          ����(��ǥ)
 *    ================= NCS
 * 
 */

// UPDOWN����

import java.util.Scanner;

public class �ڹٸ޼ҵ�1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �����߻� 1~100
		int com=(int)(Math.random()*100)+1;
		
		
		Scanner scan=new Scanner(System.in);
		while(true)
		{
			//������Է�
			System.out.println("1~100 ������ ������ �Է��Ͻÿ�");
			int user=scan.nextInt();
			
			if(user<1 || user>100)
				{
				System.out.println("1~100 ������ ������ �Է��Ͻÿ�");
				//while�� ���ǽ����� �̵�
				continue;
				}
				
			// ��Ʈ
			if(com>user)
			{
				System.out.println("Up!");
			}
			else if(com<=user)
			{
				System.out.println("Down!");
			}
			else
			{
				// ���Ῡ��
				System.out.println("�����Դϴ�!");
				break;
			}
		}
	}
}
