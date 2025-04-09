public class StudentBuilder {
    String id;
    String name;
    int age;
    String college;
    DepartmentType department;
    CollegeYear year;

    protected StudentBuilder() {}

    public static StudentBuilder builder() {
        return new StudentBuilder();
    }

    public StudentBuilder setId(String id) {
        this.id = id;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setCollege(String college) {
        this.college = college;
        return this;
    }

    public StudentBuilder setDepartment(DepartmentType department) {
        this.department = department;
        return this;
    }

    public StudentBuilder setYear(CollegeYear year) {
        this.year = year;
        return this;
    }

    public Student build() {
        return new Student(this);
    }
}
