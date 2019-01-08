import java.util.Scanner;
public class ReverseS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,length;
		String old, reverse="";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string:");
		old=scan.nextLine();
		length=old.length();
		for(i=length-1; i>=0; i--)
		{
			reverse=reverse + old.charAt(i);
		}
		System.out.println("Reverse of string is:" +reverse);;

	}

}
