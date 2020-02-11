import java.util.Scanner;

public class SimpsonsRule {
	
	public static void main(String[]args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter Delta X: ");
		float dx = scan.nextFloat();
		
		System.out.print("Enter N: ");
		int n = scan.nextInt();
		while(n%2==1) {
			System.out.print("Uh oh, N must be divisible by 2, try again\nN: ");
			n = scan.nextInt();
		}
		
		System.out.print("Enter the function: ");
		String fx = scan.nextLine();
		
		
		
	}

}
