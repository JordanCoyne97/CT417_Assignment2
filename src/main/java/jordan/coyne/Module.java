package jordan.coyne;

import java.util.ArrayList;

public class Module {

    private ArrayList<Module> modules = new ArrayList<>();
    private String moduleName;
    private ArrayList<Student> students = new ArrayList<>();
    private CourseProgramme courses = new CourseProgramme();

    public Module(String name){
        this.moduleName = name;
    }

    public Module(ArrayList<Module> module) {
        this.modules = module;
    }

    public ArrayList<Module> getModuleName() {
        return modules;
    }

    public void setModuleName(ArrayList<Module> moduleName) {
        this.modules = moduleName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public CourseProgramme getCourses() {
        return courses;
    }

    public void setCourses(CourseProgramme courses) {
        this.courses = courses;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
