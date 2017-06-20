package test;

import code.Person;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;


/**
 * Created by Simon on 6/13/17.
 */
public class PersonTest {

    @Test
    public void constructPersonObject() {
      Person person = new Person("Kevin", 18, "Male", null);
      assertNotNull(person);
      assertEquals("Kevin", person.getFirstName());
      assertEquals(18, person.getAge());
      assertEquals("Male", person.getGender());
    }
}
