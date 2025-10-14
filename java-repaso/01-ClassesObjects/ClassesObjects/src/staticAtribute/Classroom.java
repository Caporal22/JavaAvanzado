package staticAtribute;

public class Classroom {
    private String studentName;
    private static String schoolName = "Centro de Enseñanza Tecnica Industrial";

    public Classroom(String studentName) {
        this.studentName = studentName;
    }

    public void showInfo() {
        System.out.println("Student Name: " + studentName + " -- School Name: " + schoolName);
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        Classroom.schoolName = schoolName;
    }
}
