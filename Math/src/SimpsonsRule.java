import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpsonsRule {
	
	public static void main(String[]args) {
		// String to be scanned to find the pattern.
	      String line = "This order was placed for QT3000! OK?";
	      String pattern = "(.*)(\\d+)(.*)";

	      // Create a Pattern object
	      Pattern r = Pattern.compile(pattern);

	      // Now create matcher object.
	      Matcher m = r.matcher(line);
	      if (m.find( )) {
	         System.out.println("Found value: " + m.group(0) );
	         System.out.println("Found value: " + m.group(1) );
	         System.out.println("Found value: " + m.group(2) );
	      }else {
	         System.out.println("NO MATCH");
	      }
		
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
