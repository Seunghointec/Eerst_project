package ClassRoom;



public class Test {
    public static void main(String[] args) {
            Student student =new Student("jane", 12);
        int[] grades = new int[] {78,46,83,65,57,87,39,89,97,100};
        System.out.println();
        ReportCard.getGrades(grades);
        System.out.println(grades);
        ReportCard.getAverageGrade();
        }

}
