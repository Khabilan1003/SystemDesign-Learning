public class Main {
    public static void main(String[] args) {
        Student student = StudentBuilder.builder().setId("2007027").setAge(22).setName("Khabilan")
                .setCollege("CIT, Coimbatore").setYear(CollegeYear.FOURTH).setDepartment(DepartmentType.INFORMATION_TECHNOLOGY).build();

        System.out.println(student);
    }
}