package principles;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calci obj = new Calci();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice :");
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		int ch = s.nextInt();
		System.out.println("Enter values of 2 numbers:");
		int a = s.nextInt();
		int b = s.nextInt();
		int res = 0;
		switch(ch) {
		case 1:res = obj.addition(a,b);
		break;
		case 2:res = obj.subtraction(a,b);
		break;
		case 3:res = obj.multiplication(a,b);
		break;
		case 4:res = obj.division(a,b);
		break;
		default : System.out.println("Enter correct choice");
		}
		System.out.println("The result is : "+res);

	}

}
