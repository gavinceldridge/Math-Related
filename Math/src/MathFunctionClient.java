import java.util.Scanner;

public class MathFunctionClient {

	public void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("Enter a function: \nf(x) = ");
		String inp = scan.nextLine();
		
		MathFunction fxn = new MathFunction(inp);
		
		
		
	}
	
}
