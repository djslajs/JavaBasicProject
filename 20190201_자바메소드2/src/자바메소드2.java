// �Է�
/*
 * 
 *    ���� �߱�����
 *    1) ���� �߻�
 *    2) ����� �߻�
 *    3) ��
 *    4) ��Ʈ
 *    5) ����
 * 
 * 
 */

import java.util.Scanner;

public class �ڹٸ޼ҵ�2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����
		int[] com=new int[3];
		//�ߺ����� ����
		int su=0;//���� ���� ����
		boolean bCheck=false;
		for(int i=0; i<3; i++)
		{
			//�ߺ����� Ȯ��
			bCheck=true;
			while(bCheck)
			{
				//���� �߻�
				 su=(int)(Math.random()*9)+1; //1~9������ ����
				 // while�� ����
				 bCheck=false;
				 
				 for(int j=0; j<3; j++)
				 {
					 if(com[j]==su)
					 {
						 //while�� �ٽ� ����
						 bCheck=true;
						 break; //for => while ���ǽ����� �̵�
					 }
				 }
			}
			com[i]=su;
		}
		//����� �Է�
		Scanner scan=new Scanner(System.in);
		//����ڰ� �Է��� ������ �����ϴ� ����
		int[] user= new int[3];
		while(true)
		{
			System.out.println("3�ڸ� ������ �Է��ϼ���  : ");
			int input=scan.nextInt();
			
			if(input<1 ||input>1000)
			{
				System.out.println("3�ڸ� ������ �ƴմϴ�! �ٽ� �Է��ϼ��� : ");
				continue; //while���� ���ǽ����� �̵�
			}
			
			//3�ڸ� ���� => �迭�� ����
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//���� ó�� 1) 0�� �����ϸ� �ȵȴ�, 2) ���� ���� �����ϸ� �ȵȴ�
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.out.println("0�� ����Ҽ� �����ϴ�");
				continue;
			}
			
			if(user[0]==user[1] || user[0]==user[2] || user[1]==user[2])
			{
				System.out.println("�ߺ��� ���� ����� �� �����ϴ�");
				continue;
			}
			
			//��
			int s=0, b=0;
			for(int i=0; i<3; i++)//com[i]
			{
				for(int j=0; j<3; j++)//user[i]
				{
					if(com[i]==user[j])// ���� ���� �ִ� ��� 
					{
						if(i==j)//���� �ڸ��� �ִ°��
						{
							s++;
						}
						else
						{
							b++;
						}
					}
				}
			}
			System.out.printf("Input Number : %d, Result:%dS-%dB\n",input, s,b);
			
			if(s==3)
			{
				System.out.println("Game Over!!");
				break;
			}
			
		}
	}

}










