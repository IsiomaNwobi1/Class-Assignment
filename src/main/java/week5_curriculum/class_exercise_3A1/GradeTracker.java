package week5_curriculum.class_exercise_3A1;

import java.util.HashMap;

public class GradeTracker {
    private int StudentID;
    private double StudentGrade;

    public GradeTracker(int studentID, double studentGrade) {
        StudentID = studentID;
        StudentGrade = studentGrade;
    }

    public int getStudentID() {
        return StudentID;
    }

    public double getStudentGrade() {
        return StudentGrade;
    }

    HashMap<Integer, Double> tracker = new HashMap<>();
    public void addGrade(int studentID, double studentGrade){
        tracker.put(studentID, studentGrade);
    }

    public double getGrade(int studentID){
        return tracker.put(studentID, -1.0);
        }
    }