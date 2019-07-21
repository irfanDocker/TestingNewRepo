package ourFirstJavaProgram;

import java.util.Scanner;

public class MyFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
////		System.out.print("My First Programm, Hello TechCircle!");
////		
////		System.out.print("Yellow");
////		
////		System.out.println("Hello World");
////		
////		System.out.println("helloMyCompt");
//		
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("Please enter your Username");
//	String s = in.nextLine();
//		System.out.println("Your user name is < "+s+" >");
//		in.close();
//		
//	//data types
//		boolean a = true;
//		boolean b = false;
//		char c = 65535;
//		char d = 'A';
//		byte e = -128;
//		int f = 234234;
//		short g = 23423;
//		float t = 2.3f;
//		double h = 2.3d;
		
		//task
		
		Scanner taskScanner = new Scanner(System.in);
		
		
		System.out.println("Please enter your Frist Name");
		String firstName = taskScanner.nextLine();
		
		System.out.println("Please enter your Last Name");
		String lastName = taskScanner.nextLine();
		
		System.out.println("Please enter your DOB");
		String dateOfBirth = taskScanner.nextLine();
		
		System.out.println("Please enter your Phone Number");
		long phoneNumber = taskScanner.nextLong();
		
		System.out.println("How tall are you in feets?");
		double yourHeight = taskScanner.nextDouble();
		
		
		System.out.println("Your full name is: "+ firstName + " "	+ lastName);
		System.out.println("Your date of birth is: " + dateOfBirth);
		System.out.println("Your Contact information is --> "+ phoneNumber);
		System.out.println("Your are " + yourHeight + " feet tall");
		taskScanner.close();
		
		
		
		
		
		
		
		
		
		
		
	}

}
