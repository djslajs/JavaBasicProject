import java.util.Scanner;
public class �ڹٸ޼ҵ�1_�ٽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
	
	}

	
	static void process()
	{
		Scanner scan=new Scanner(System.in);
		int com=random();
		
		while(true)
		{
			int user=input();
			String res=compare(com,user);
			if(user<1||user>100)
			{
				System.out.println("1~100������ ������ �Է��Ͻÿ�");
				continue;
			}
			
			if(res.equals("ok"))
			{

				break;
			}
			
			
		}
	}
	
	static int random()
	{
		return (int)(Math.random()*100)+1;
	}
	
	static int input() 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("1~100 ������ ������ �Է��ϼ��� : ");
		int user=scan.nextInt();
		
		return user;
	}
	
	static String compare(int com, int user)
	{
		String res="";
		if(com<user)
		{
			System.out.println("down!");
			res="down";
		}
		else if(com>user)
		{
			System.out.println("up!");
			res="up";
		}
		else
		{
			System.out.println("ok");
			res="ok";
		}
		return res;
	}
}
