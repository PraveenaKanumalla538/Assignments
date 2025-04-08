package sample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class FirstClass {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Hello World!");

		System.out.print("Hello");
		System.out.print("World");
		System.out.println();
		System.out.printf("%s is working as a test engineer, EmpID is %d, Visa status is %b", "Veena", 1234, true);
		System.out.println();
		System.out.format("Total bill is %.2f", 100.987655456);
		System.out.println();
		System.out.append("My name is veena ").append("My empid is 1234");
		System.out.println();
		System.out.write(65);
		Logger log = Logger.getLogger("My Logger");
		log.info("Current line is 27");
		System.out.println();
		log.warning("There is something to monitor, please check");
		System.err.println("ERROR: Expected result is not matching with the actual result");
		PrintWriter writer = new PrintWriter("C:\\AutomationTraining\\AutomationProject\\src\\sample\\Logs.txt");
		writer.println("Current line is 30");
		writer.println("Current line is 31");
		writer.println("Current line is 32");
		writer.close();
		System.out.println();

	}

}
