package jordan.coyne;

import org.joda.time.DateTime;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;

public class TestMethods {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Module> modules = new ArrayList<>();
    private ArrayList<CourseProgramme> courseProgrammes = new ArrayList<>();

    private Module module = new Module("CT417", students, courseProgrammes);
    private Module module2 = new Module("CT417", students, courseProgrammes);
    private Module module3 = new Module("CT417", students, courseProgrammes);
    private Module module4 = new Module("CT417", students, courseProgrammes);

    private CourseProgramme ComputerScience = new CourseProgramme("4BCT", modules, students,
                                            new DateTime(2019, 3, 26, 12, 0, 0, 0),
                                            new DateTime(2023, 3, 26, 12, 0, 0, 0));

    private CourseProgramme Engineering = new CourseProgramme("4EE", modules, students,
            new DateTime(2019, 3, 26, 12, 0, 0, 0),
            new DateTime(2023, 3, 26, 12, 0, 0, 0));


    private Student student1 = new Student("Mike", 19, "19/12/1998", 16543823);
    private Student student2 = new Student("Karen", 20, "21/07/1998", 37295367);
    private Student student3 = new Student("Clare", 18, "09/06/1998", 22346439);
    private Student student4 = new Student("David", 29, "29/02/1998", 57398204);

    @Test
    public void getUserName(){
        ArrayList<Module> modules = new ArrayList<>();
        ArrayList<CourseProgramme> courseProgramme = new ArrayList<>();
        Student mike = new Student("Mike", 19, "19/12/1998", 16543823);

        String expectedAnswer = "Mike19";
        String answer = mike.getUserName();

        assertEquals(expectedAnswer, answer);
    }
}
