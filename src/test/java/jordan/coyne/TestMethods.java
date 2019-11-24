package jordan.coyne;

import org.joda.time.DateTime;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;


import org.junit.Test;
import java.util.ArrayList;

public class TestMethods {
    
    private Student student1 = new Student();

    @Test
    public void getUserName(){
        student1.setName("Mike");
        student1.setAge(19);

        String expectedAnswer = "Mike19";
        String answer = student1.getUserName();

        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void checkStudentName(){
        student1.setName("Jerry");
        String expectedAnswer = "Jerry";

        String answer = student1.getName();
        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void checkStudentsCourse(){
        student1.setCourses("Computer Science");

        String expectedAnswer = "Computer Science";
        String answer = student1.getCourses();

        assertEquals(expectedAnswer, answer);
    }

    @Test
    public void checkStudentModules(){
        ArrayList<Module> modules = new ArrayList<>();
        modules.add(new Module("Software Eng"));
        modules.add(new Module("Machine Learning"));
        student1.setModules(modules);

        ArrayList<Module> answer = student1.getModules();

        assertArrayEquals(modules.toArray(), answer.toArray());
    }
}
