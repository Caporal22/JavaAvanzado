package staticAtribute;

public class MainClassroom {
    public static void main(String[] args) {
        Classroom student1 = new Classroom("Daniel");
        Classroom student2 = new Classroom("Alejandro");

        student1.showInfo();
        student2.showInfo();

        Classroom.setSchoolName("School 2");

        student1.showInfo();
        student2.showInfo();
    }
}
