package Day7;

import java.io.*;
import java.util.*;

public class StudentMain {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        // Create and add student objects
        try {
            students.add(new Student(1, "Aarav", "CS", 85, 92));
            students.add(new Student(2, "Neha", "IT", 55, 81)); // will throw exception
            students.add(new Student(3, "Ravi", "CS", 78, 75));
            students.add(new Student(4, "Simran", "IT", 90, 88));
            students.add(new Student(5, "Rahul", "ECE", 62, 79));
            students.add(new Student(6, "Priya", "CS", 95, 95));
            students.add(new Student(7, "Kiran", "EEE", 59, 70)); // will throw exception
            students.add(new Student(8, "Isha", "CS", 88, 83));
            students.add(new Student(9, "Manav", "ME", 74, 69));
            students.add(new Student(10, "Sneha", "IT", 91, 90));
        } catch (LowAttendanceException e) {
            System.out.println("Warning: " + e.getMessage());
        }

        // Sort students by attendance (descending order)
        students.sort((s1, s2) -> Double.compare(s2.getAttendance(), s1.getAttendance()));

        // Serialize to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students.dat"))) {
            oos.writeObject(students);
            System.out.println("\n✅ Students serialized successfully to students.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and print
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students.dat"))) {
            List<Student> savedStudents = (List<Student>) ois.readObject();
            System.out.println("\n📋 Students (sorted by attendance):");
            for (Student s : savedStudents) {
                System.out.println(s);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
