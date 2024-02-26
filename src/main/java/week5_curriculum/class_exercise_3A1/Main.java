package week5_curriculum.class_exercise_3A1;

public class Main {
    public static void main(String[] args) {

        GradeTracker student1 = new GradeTracker(01, 90.0);
        GradeTracker student2 = new GradeTracker(02, 80.0);
        GradeTracker student3 = new GradeTracker(03, 70.0);

        System.out.println("Grade for first student is : " + student1.getStudentGrade());
        System.out.println("Grade for second student is : " + student2.getStudentGrade());
        System.out.println("Grade for third student is : " + student3.getStudentGrade());
        }
    }