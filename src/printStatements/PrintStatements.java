package printStatements;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Logger;

public class PrintStatements {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Hello Uday Sai");
		System.out.printf("%s is completed Btech and employee id is %d and visa status is %b", "udaysai",1120,true);
		System.out.println();
		//%s= String, %d =digit, %b;
		double usd= 112.30023;
		System.out.printf("price is : %.2f", usd);
		System.out.println();
	//print error messages
		
		System.err.println("there is an error in line 20. please review");
	
		//print a multiline print message
		
		System.out.println("""
				My name is uday sai.
				My qualification is masters
				My role is quality analyst """);
		System.out.println();
		
		//print the logs during the executin process to moniter and understand the outcome of each and every line and each every stage 
		
		System.out.println();
		
		Logger log= Logger.getLogger("Hello world");
		log.info(" hem man, currenlty we have completed line 46, congratulations");
		System.out.println();
		log.warning("hey man line 14 is successfuloly completed, how ever there is an error");
		
		// print and export the log messages into text file
		
		PrintWriter logger = new PrintWriter("C:\\AutomationTraining\\JavaTraining\\Logs.txt");
		logger.println("user is successfully completed");
		logger.println("user is successfully completed");
		logger.close();
		
		
		
		//Temperature of a city in degrees Celsius
		
		double ud =25.5000f;
	System.out.printf(" Temperature of a city in degree Celcisius is : %.2f", ud);
	System.out.println();

		Boolean n =true;
		System.out.printf("whether customer placed an order is : %b", n);
		
		System.out.println();
	
		// person qualification
		
		String pn = "Software Engineer";
		System.out.printf(" Person qualification  is : %s", pn);

		
		//Rating of a movie
		System.out.println();
		float fn =7.5f;
		System.out.printf(" Rating of a movie is : %.1f", fn);
		System.out.println();
		char ch ='A';
		System.out.printf("Person Blood type is : %s", ch);
		
	}
		
}

