import java.util.Scanner;
public class IT24101520Lab4Q3 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	System.out.print("Enter a number: ");
	int num = input.nextInt();
	String output;
	
	output =num == 0 ? "The number is Zero":
			num >= 1 ? "The number is Positive":
			"The number is Negative";
	
	System.out.print(output);
	
	}
}