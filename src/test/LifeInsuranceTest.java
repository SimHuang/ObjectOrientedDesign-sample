package test;

import code.HealthCondition;
import code.LifeInsurance;
import code.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertThat;

/**
 * Created by Simon on 6/13/17.
 */
public class LifeInsuranceTest {

    @Test
    public void constructLifeInsurance() {
        LifeInsurance lifeInsurance = new LifeInsurance();
        assertNotNull(lifeInsurance);
        assertEquals(100.0, lifeInsurance.getCost());
    }

    @Test
    public void checkAgeConditionTest() {
        Person person = new Person("Kevin", 23, "Male", null);
        LifeInsurance lifeInsurance = new LifeInsurance();
        lifeInsurance.checkAgeCondition(person);
        assertNotNull(person);
        assertNotNull(lifeInsurance);
        assertEquals(120.0, lifeInsurance.getCost());
    }

    @Test
    public void checkGenderCondition() {
        Person person = new Person("Cassie", 23, "Female", null);
        LifeInsurance lifeInsurance = new LifeInsurance();
        lifeInsurance.checkGenderCondition(person);
        assertNotNull(person);
        assertNotNull(lifeInsurance);
        assertEquals(88.0, lifeInsurance.getCost());
    }

    @Test
    public void determineHeartDiseasePrice() {
        Person person = new Person("Cassie", 50, "Male", HealthCondition.HEART_DISEASE);
        LifeInsurance lifeInsurance = new LifeInsurance();
        lifeInsurance.checkHealthCondition(person);
        assertNotNull(person);
        assertNotNull(lifeInsurance);
        assertEquals(117.0, lifeInsurance.getCost());
    }

    @Test
    public void determineAllergyPrice() {
        Person person = new Person("Cassie", 50, "Male", HealthCondition.ALLERGIES);
        LifeInsurance lifeInsurance = new LifeInsurance();
        lifeInsurance.checkHealthCondition(person);
        assertNotNull(person);
        assertNotNull(lifeInsurance);
        assertEquals(101.0, lifeInsurance.getCost());
    }

    @Test
    public void determineSleepApneaPrice() {
        Person person = new Person("Cassie", 50, "Male", HealthCondition.SLEEP_APNEA);
        LifeInsurance lifeInsurance = new LifeInsurance();
        lifeInsurance.checkHealthCondition(person);
        assertNotNull(person);
        assertNotNull(lifeInsurance);
        assertEquals(106.0, lifeInsurance.getCost());
    }
}
