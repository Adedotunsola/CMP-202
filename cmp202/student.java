package User;

public class Student extends User {
    String matric_no = "BHU/22/04/05/0103";
    String admission_no = "1719393941";
    String registerCourse() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "You cannot register at this moment, insuffient Funds";
        } else {
            return "You have registered for all courses";
        }
    }
    String checkResults() {
        if (matric_no.equals("") || admission_no.equals("")) {
            return "Cannot check your result, insuffient funds or Incomplete course registration";
        } else {
            return "You got 4A's 6B's and 8C's";
        }
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Shallom Bonet";
        student.password = "Shallom1234$";
        System.out.println(student.register());
        System.out.println(student.registerCourse());
        System.out.println(student.checkResults());
    }
}