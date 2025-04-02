package Q5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String studentName = scanner.nextLine();
        System.out.println("Enter Degree Name: ");
        String degreeName = scanner.nextLine();
        System.out.println("Enter Course Following: ");
        String courseFollowing = scanner.nextLine();

        Student student = new Student(studentName, degreeName, courseFollowing);

        System.out.println("Enter Lecturer Name: ");

        String lecturerName = scanner.nextLine();
        System.out.println("Enter Course Teaching: ");
        String courseTeaching = scanner.nextLine();

        Lecturer lecturer = new Lecturer(lecturerName, courseTeaching);

        System.out.println("Enter Course Name: ");
        String courseName = scanner.nextLine();
        System.out.println("Enter Course Code: ");
        String courseCode = scanner.nextLine();

        Course course = new Course(courseName, courseCode);


        System.out .println("Student Name: " + student.getStudentName());
        System.out.println("Degree Name: " + student.getDegreeName());
        System.out.println("Course Following: " + student.getCourseFollowing());

        System.out.println("Lecturer Name: " + lecturer.getLecturerName());
        System.out.println("Course Teaching: " + lecturer.getCourseTeaching());

        System.out.println("Course Name: " + course.getCourseName());
        System.out.println("Course Code: " + course.getCourseCode());







    }

}
