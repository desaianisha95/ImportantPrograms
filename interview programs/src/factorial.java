import java.util.Scanner;
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,i,fact=1;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a Number:");
		num=scan.nextInt();
		for(i=num; i> 0;i--)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " + num + "is" + fact);
		

	}

}
