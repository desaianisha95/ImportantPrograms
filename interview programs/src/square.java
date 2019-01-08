import java.util.Scanner;
public class square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,squaren;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		num=scan.nextInt();
		squaren=num*num;
		System.out.println("Square : " +squaren);
	}

}
