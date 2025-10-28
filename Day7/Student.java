package Day7;

import java.io.Serializable;

public class Student implements Serializable {
    private int rollno;
    private String sname;
    private String course;
    private double attendance_percentage;
    private double score;

    // Default Constructor
    public Student() {}

    // Parameterized Constructor
    public Student(int rollno, String sname, String course, double attendance_percentage, double score)
            throws LowAttendanceException {
        this.rollno = rollno;
        this.sname = sname;
        this.course = course;
        this.attendance_percentage = attendance_percentage;
        this.score = score;

        if (attendance_percentage < 60) {
            throw new LowAttendanceException(
                "Student " + sname + " (" + rollno + ") has attendance below 60%!"
            );
        }
    }

    // Calculate Grade
    public String calculateGrade() {
        if (score >= 90)
            return "A";
        else if (score >= 75)
            return "B";
        else if (score >= 60)
            return "C";
        else
            return "D";
    }

    // Getters
    public double getAttendance() {
        return attendance_percentage;
    }

    public String getName() {
        return sname;
    }

    @Override
    public String toString() {
        return "Roll No: " + rollno + ", Name: " + sname + ", Course: " + course +
                ", Attendance: " + attendance_percentage + "%, Score: " + score +
                ", Grade: " + calculateGrade();
    }
}
