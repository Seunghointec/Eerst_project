package ClassRoom;

public class Student {
    private int studentID;
    private String name;
    private ReportCard reportCard;
    private static int numberOfStudents;


    public Student() {
        reportCard = new ReportCard();
    }

    public Student(String name, int studentID) {
        this();
        this.name =name;
        this.studentID = studentID;
        numberOfStudents++;
    }

    public int getStudentID() {
        return studentID;
    }

    public ReportCard getReportCard() {
        return reportCard;
    }
}
