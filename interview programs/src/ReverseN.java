import java.util.Scanner;
public class ReverseN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, rev=0,rem;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to reverse");
		num=scan.nextInt();
		while(num!=0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println("Reverse of a number is:" +rev);


	}

}
