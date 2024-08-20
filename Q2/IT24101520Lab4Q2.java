import java.util.Scanner;
public class IT24101520Lab4Q2 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner (System.in);
	
	
	/*int examMarks=0;
	double labMarks=0;
	int examPercen=0;
	int labPercen=0;*/
	
	//get user input of exam marks
	System.out.print("Enter exam marks (out of 100): ");
	int examMarks = input.nextInt();
	
	//validate exam marks either it is above 0 and below 100
	if (examMarks > 100 && examMarks < 0)
	{
		System.out.print("Invalid input for the exam marks. Terminating program.");
	}
	
	//get user input of lab submission marks
	System.out.print("Enter lab submission marks(out of 100): ");
	double labMarks = input.nextDouble();
	
	//validate lab submission marks either it is above 0 and below 100
	if (labMarks > 100 && labMarks < 0)
	{
		System.out.print("Invalid input for the lab submission marks. Terminating program.");
	}
	
	//get user inputs of exam marks and lab submission marks add upto 100
	System.out.print("Enter the percentage given for the exam: ");
	int examPercen = input.nextInt();
	
	System.out.println("Enter the percentage given for the lab submission: ");
	int labPercen = input.nextInt();
	
	//This null print is used for get the empty line in the output for aesthetic measures.
	System.out.print("");
	
	//validating the lab percentage and the exam mark percentages.
		if (examPercen + labPercen == 100)
		{
			double finalMark = (examMarks + labMarks)/2;
			System.out.print("Final Exam Mark : " + finalMark);
		}
		else
		{
			System.out.print("Percentages must add upto 100. Terminating program.");
		}
	}
}