package jordan.coyne;

import org.joda.time.DateTime;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class TestMethods {

    @Test
    public void getUserName(){
        ArrayList<CourseProgramme> courseProgramme = new ArrayList<>();
        courseProgramme.add(new CourseProgramme("Computer Science" , new DateTime() , new DateTime()));

        ArrayList<Module> modules = new ArrayList<>();
        modules.add(new Module("CT417"));

        Student mike = new Student("Mike", 19, "19/12/1998", 16543823);

        mike.setModules(modules);
        mike.setCourses(courseProgramme);

        String expectedAnswer = "Mike19";
        String answer = mike.getUserName();

        assertEquals(expectedAnswer, answer);
    }
}
