package code;

import java.util.List;

public class Person {
	
	private String firstName;
	private int age;
	private String gender;
//	private List<String> healthConditions;
	private boolean isQualifyForInsurance;
	private HealthCondition healthCondition;

	public Person() {}
	
	public Person(String firstName, int age, String gender, HealthCondition healthCondition) {
		this.firstName = firstName;
		this.age = age;
		this.gender = gender;
		this.healthCondition = healthCondition;
		this.isQualifyForInsurance = true;
	}
	
	public String getFirstName() {

		return firstName;
	}
	
	public void setFirstName(String firstName) {

		this.firstName = firstName;
	}
	
	public int getAge() {

		return age;
	}
	
	public void setAge(int age) {

		this.age = age;
	}
	
	public String getGender() {

		return gender;
	}
	
	public void setGender(String gender) {

		this.gender = gender;
	}

	public HealthCondition getHealthCondition() {
		return healthCondition;
	}

	public void setHealthCondition(HealthCondition healthCondition) {
		this.healthCondition = healthCondition;
	}
	
//	public List<String> getHealthConditions() {
//
//		return healthConditions;
//	}

	public boolean isQualifyForInsurace() {
		return isQualifyForInsurance;
	}

	public void setIsQualifyForInsurance(boolean isQualifyForInsurance) {
		this.isQualifyForInsurance = isQualifyForInsurance;
	}


	/**
	 * Determine the enum health condition base on user input
	 */
	public static HealthCondition determineHealthCondition(String condition) {
		switch(condition) {
			case "ALLERGIES":
				return HealthCondition.ALLERGIES;

			case "SLEEP APNEA":
				return HealthCondition.SLEEP_APNEA;

			case "HEART DISEASE":
//				person.setHealthCondition(HealthCondition.HEART_DISEASE);
				return HealthCondition.HEART_DISEASE;

			default:
				System.out.println("Condition does not exist");
				return null;
		}
	}
	
//	public void setHealthConditions(List<String> healthConditions) {
//
//		this.healthConditions = healthConditions;
//	}
}
