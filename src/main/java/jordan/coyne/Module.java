package jordan.coyne;

import java.util.ArrayList;

public class Module {

    private String moduleName;
    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<CourseProgramme> courses = new ArrayList<>();

    public Module(String moduleName, ArrayList<Student> students, ArrayList<CourseProgramme> courses) {
        this.moduleName = moduleName;
        this.students = students;
        this.courses = courses;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }
}
