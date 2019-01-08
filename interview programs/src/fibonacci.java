import java.util.Scanner;
public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0,b=1,c,i,num;
		Scanner scan = new Scanner(System.in);
		System.out.println("How many terms?");
		num=scan.nextInt();
		System.out.print("Fibonacci Series : " + a + "  " + b + "  ");
		for(i=0;i<=num;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c+"");
			
		}
			
		

	}

}
