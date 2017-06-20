package code;

public class LifeInsurance {
	
	private double cost;
	
	public LifeInsurance() {
		cost = 100;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	/**
	 * Determine change in life insurance cost base on age
	 */
	public void checkAgeCondition(Person person) {
		if(person.getAge() < 18) {
			person.setIsQualifyForInsurance(false);
			return;
		}

		int numOverFiverYears = (person.getAge() - 18)/5;
		cost += 20 * numOverFiverYears;
	}
	
	/**
	 * Determine change in life insurance cost base on gender
	 */
	public void checkGenderCondition(Person person) {
		if(person.isQualifyForInsurace()) {
			if (person.getGender().equalsIgnoreCase("female")) {
				cost -= 12;
			}
		}
	}
	
	/**
	 * Determine change in life insurance cost base on health conditions
	 */
	public void checkHealthCondition(Person person) {
		if(person.isQualifyForInsurace()) {
			switch(person.getHealthCondition()) {
				case ALLERGIES:
					cost *= 1.01;
					break;

				case SLEEP_APNEA:
					cost *= 1.06;
					break;

				case HEART_DISEASE:
					cost *= 1.17;
					break;

				default:
					break;
			}
		}
	}

}
