//dlskflskjflakjlkdf

import java.util.Scanner;

public class �ڹٸ޼ҵ�1_updown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	}
	
	static void process()
	{
		
		Scanner scan=new Scanner(System.in);
		int com=com();
		//System.out.println(com);
		while(true)
		{
			
			int user=user();
			String res=compare(user,com);
			
			if(user<1 || user>100)
			{
				System.out.println("1~100 ������ ������ �Է��Ͻÿ�");
				//while�� ���ǽ����� �̵�
				continue;
			}
			
			if(res.equals("OK"))
			  {
				/*
				 * System.out.println("�����ұ��?(Y,N):"); String s=scan.next();
				 * 
				 * if(s.equalsIgnoreCase("n")); { process(); // ���ȣ�� } else {
				 * System.out.println("�����մϴ�!!"); System.exit(0); // }
				 */
				  break;
				  
			  }
		}
	}
	
	//���� �߻�
	static int com()
	{
		
		return (int)(Math.random()*100)+1;
	}
	
	//����� �Է�
	static int user()
	{
		Scanner scan= new Scanner(System.in);
		System.out.println("1~100 ������ ������ �Է��Ͻÿ�: ");
		int user=scan.nextInt();
		return user;
	}
	
	//��Ʈ
	static String compare(int user, int com)
	{
		String res="";
		
		if(com>user)
		{
			System.out.println("Up!");
			res="UP!";
		}
		else if(com<user)
		{
			System.out.println("Down!");
			res="Down!";
		}
		else
		{
			// ���Ῡ��
			System.out.println("�����Դϴ�!");
			res="OK";
		}
		
		return res;
	}

}
