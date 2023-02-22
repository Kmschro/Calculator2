import java.util.Scanner;
public class Calculator {
//Commit
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number1, number2;
		int sum;
		int num1,num2;
		double sum2;
		System.out.println("Enter one number:");
		number1 = scan.nextInt();
		System.out.println("Enter a second number:");
		number2 = scan.nextInt();
		sum = number1 +number2;
		System.out.println("Sum: "+ sum);
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Would you like to do addition, subtraction, multiplication, or division?");
		String numOperator = scan2.next();
		if (numOperator == "Addition" || numOperator == "addition" || numOperator == "Add" || numOperator == "add") 
		{
			System.out.println("Enter two numbers:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			sum2 = (num1 +num2 ) *1.0;
			System.out.println(sum);
		}
		else if (numOperator == "Subtraction" || numOperator == "subtraction" || numOperator == "Subtract" || numOperator == "subtract")
		{
			System.out.println("Enter two numbers:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			sum2 = (num1 +num2 ) *1.0;
			System.out.println(sum);
		}else if (numOperator == "Multiplication" || numOperator == "multiplication" || numOperator == "Multiply" || numOperator == "multiply")
		{
			System.out.println("Enter two numbers:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			if (num1 == 0 || num2 == 0) {
				System.out.println("Can't multiply by 0");
			} 
			else 
			{
			sum2 = (num1 *num2 ) *1.0;
			System.out.println(sum);
			}
		}
		else if (numOperator == "Division" || numOperator == "division" || numOperator == "Divide" || numOperator == "divide")
		{
			System.out.println("Enter two numbers:");
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			if (num1 == 0 || num2 == 0) 
			{
				System.out.println("Can't divide by 0");
			}
			else 
			{
			sum2 = (num1 / num2 ) *1.0;
			System.out.println(sum);
			}
		}
		else 
		{
			System.out.println("Error try again");
		}
	}

}



	