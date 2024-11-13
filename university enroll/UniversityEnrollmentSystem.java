//  (base class )
class Course {
    public String courseName;
    public int courseID;
    public Faculty courseFaculty;  

    // Constructor 
    public Course(String courseName, int courseID, Faculty courseFaculty) {
        this.courseName = courseName;
        this.courseID = courseID;
        this.courseFaculty = courseFaculty;
    }
}
// Subclass 
class CodingCourse extends Course {
    // Constructor
    public CodingCourse(String courseName, int courseID, Faculty courseFaculty) {
        super(courseName, courseID, courseFaculty);
    }
}

// Subclass
class AptitudeCourse extends Course {
    // Constructor 
    public AptitudeCourse(String courseName, int courseID, Faculty courseFaculty) {
        super(courseName, courseID, courseFaculty);
    }
}

// Faculty class
class Faculty {
    private String name; // encapsulation

    // Constructor 
    public Faculty(String name) {
        this.name = name;
    }

    public String getName() { // getter applying
        return name;
    }
}

// Student class 
class Student {
    public String name;
    public int studentID;  
    public Course[] enrolledCourses; // Array of coursee (aggregation)

    // Method to display the details
    public void displayDetails() {
        System.out.println(name + " (ID: " + studentID + ") has been successfully enrolled in the following courses:");
        for (Course x : enrolledCourses) {
            // Display course details 
            System.out.println("Course Name: " + x.courseName + " (Course ID: " + x.courseID + ")");
            System.out.println("Taught by: " + x.courseFaculty.getName());  // Display faculty name
        }
    }

    // Method to set student details 
    public void enrollInCourse(String name, int studentID, Course x) { // single course 
        this.name = name;
        this.studentID = studentID;
        enrolledCourses = new Course[]{x};
        // Display the enrollment details
        displayDetails();
    }
// overloading 
    public void enrollInCourses(String name, int studentID, Course[] array) { // multiple course
        this.name = name;
        this.studentID = studentID;
        enrolledCourses = array;
        // Display the enrollment details 
        displayDetails();
    }
}

// Main driver class
public class UniversityEnrollmentSystem {
    public static void main(String[] args) {
        //  faculty objects and construction calling
        Faculty f1 = new Faculty("Dr.sheldon cooper");
        Faculty f2 = new Faculty("Dr.rajesh k ");

        //subclasses objects with parent class reference 
        Course CC = new CodingCourse("web -d", 400481, f1);  // Coding course with Faculty 1
        Course AC = new AptitudeCourse("CAT -Aptitude", 194672, f2);  // Aptitude course with Faculty 2
        Student s = new Student();
        // Enroll student in one course ONLY
        s.enrollInCourse("Shaurya", 07226, AC);  // Single course enrollment
        // Enroll student in multiple courses using the overloaded method 
        s.enrollInCourses("Shaurya jain", 18641, new Course[] {AC, CC});  // Multiple course enrollment
    }
}