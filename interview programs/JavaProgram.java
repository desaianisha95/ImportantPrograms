import java.util.Scanner;
public class JavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, i;
		boolean isPrime=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number:");
		num=scan.nextInt();
		for(i=2; i<=num/2; i++)
		{
			if(num %i==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println("This is a prime number");
		}
		else
		{
			System.out.println("This is not a prime number");
		}
			
		
			

	}

}
