import java.util.Scanner;

public class �ڹٸ޼ҵ�2_Game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	
	static void process()
	{
		int[] com=ran();
		
		Scanner scan=new Scanner(System.in);
		int[] user= new int[3];
		
		
	}

	//����
	static int[] ran()
	{
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
		
		return com;
	}
	
	//������Է�
	static int[] input()
	{
		Scanner scan=new Scanner(System.in);
		//����ڰ� �Է��� ������ �����ϴ� ����
		int[] user= new int[3];
		int input=scan.nextInt();
		
		//3�ڸ� ���� => �迭�� ����
		user[0]=input/100;
		user[1]=(input%100)/10;
		user[2]=input%10;
		
		return user;
			
	}
	
	
	//�� s
	static void compare(int[] com, int[] user)
	{
		
		
	}
	
	
}
