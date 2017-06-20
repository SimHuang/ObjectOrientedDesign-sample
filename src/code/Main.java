package code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	/**
	 * The starting point of the estimate price calculator. A prompt is 
	 * opened to ask questions about user
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("What is your first name?");
			String firstName = scanner.nextLine();
			
			System.out.println("What is your age?");
			int age = scanner.nextInt();

			System.out.println("What is your gender? (Male or Female)");
			scanner.nextLine();
			String gender = scanner.nextLine();

			System.out.println("Please indicate health condition (ALLERGIES, SLEEP APNEA, HEART DISEASE).");
			String condition = scanner.nextLine();

			//perform estimation base on user information
			Person person = new Person(firstName, age, gender, Person.determineHealthCondition(condition));
			LifeInsurance lifeInsurance = new LifeInsurance();
			LifeInsuranceEstimator estimate = new LifeInsuranceEstimator(lifeInsurance, person);

			//display price estimate
			System.out.println("Your Life Insurance estimate is: " + estimate.calculateEstimate());
			System.out.println("\n");
		}
	}

}
