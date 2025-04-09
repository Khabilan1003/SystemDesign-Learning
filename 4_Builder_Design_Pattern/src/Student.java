import java.util.Collection;

public class Student {
    String id;
    String name;
    int age;
    String college;
    DepartmentType department;
    CollegeYear year;

    public Student(StudentBuilder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
        this.college = builder.college;
        this.department = builder.department;
        this.year = builder.year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", college='" + college + '\'' +
                ", department=" + department +
                ", year=" + year +
                '}';
    }
}
