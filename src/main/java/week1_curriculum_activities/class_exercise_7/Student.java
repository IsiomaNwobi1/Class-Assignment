package week1_curriculum_activities.class_exercise_7;

public class Student {

    int matricNo;
    String studentName;
    static String university = "Uniben";

    public Student(int matricNo, String studentName) {
        this.matricNo = matricNo;
        this.studentName = studentName;
    }

    public int getMatricNo() {
        return matricNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public static String getUniversity() {
        return university;
    }

    void changeUniversity(){
        System.out.println("Matric number: " + getMatricNo());
        System.out.println("Student name: " + getStudentName());
        System.out.println("University: " + getUniversity());
    }
}
