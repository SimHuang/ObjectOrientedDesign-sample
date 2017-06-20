package test;

import code.HealthCondition;
import code.LifeInsurance;
import code.LifeInsuranceEstimator;
import code.Person;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by Simon on 6/13/17.
 */
public class LifeInsuranceEstimatorTest {

    @Test
    public void constructLifeInsuranceEstimator() {
        Person person = new Person("Kevin", 18, "Male", null);
        LifeInsurance lifeInsurance = new LifeInsurance();
        LifeInsuranceEstimator lifeInsuranceEstimator = new LifeInsuranceEstimator(lifeInsurance, person);
        assertNotNull(person);
        assertNotNull(lifeInsurance);
    }

    @Test
    public void calculateLifeInsurance() {
        Person person = new Person("Kevin", 23, "Male", HealthCondition.ALLERGIES);
        LifeInsurance lifeInsurance = new LifeInsurance();
        LifeInsuranceEstimator lifeInsuranceEstimator = new LifeInsuranceEstimator(lifeInsurance, person);
        assertNotNull(person);
        assertNotNull(lifeInsurance);
        assertEquals(121.2, lifeInsuranceEstimator.calculateEstimate());
    }
}
