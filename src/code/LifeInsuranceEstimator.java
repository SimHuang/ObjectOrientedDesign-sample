package code;

/**
 * This class performs the calculation for the insurance base on the person and insurance provided
 *
 */
public class LifeInsuranceEstimator {

	private LifeInsurance lifeInsurance;
	private Person person;

	public LifeInsuranceEstimator(LifeInsurance lifeInsurance, Person person) {

		this.lifeInsurance = lifeInsurance;
		this.person = person;
	}
	
	public LifeInsurance getLifeInsurance() {

		return lifeInsurance;
	}
	
	public void setLifeInsurance(LifeInsurance lifeInsurance) {

		this.lifeInsurance = lifeInsurance;
	}

	public Person getPerson(){
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	/**
	 * Perform all calculations needed for life insurance estimate
	 * @return	price estimate
	 */
	public double calculateEstimate() {
		lifeInsurance.checkAgeCondition(person);
		lifeInsurance.checkHealthCondition(person);
		lifeInsurance.checkGenderCondition(person);

		return lifeInsurance.getCost();
	};
}
