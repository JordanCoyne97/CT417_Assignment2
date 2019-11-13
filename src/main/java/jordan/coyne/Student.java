package jordan.coyne;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private String DOB;
    private long id;
    private String userName;
    private ArrayList<CourseProgramme> courses = new ArrayList<>();
    private ArrayList<Module> modules = new ArrayList<>();

    public Student(String name, int age, String DOB, long id, String userName, ArrayList<CourseProgramme> courses, ArrayList<Module> modules) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.id = id;
        this.userName = userName;
        this.courses = courses;
        this.modules = modules;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return name + age;
    }

    public ArrayList<CourseProgramme> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<CourseProgramme> courses) {
        this.courses = courses;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
