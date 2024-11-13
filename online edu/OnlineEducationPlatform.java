// Base class Course
class Course {
    String courseName;
    int courseCode;
    // Constructor 
    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
    }
    //  method for all courses
    public void startCourse() {
        System.out.println("Welcome to the course: " + courseName);
    }
}
// Interface 
interface Interactive {
    void conductQuiz();  // Method for conducting quizzes
}
// ScienceCourse subclass 
class ScienceCourse extends Course implements Interactive {
    public ScienceCourse(String courseName, int courseCode) {
        super(courseName, courseCode);
    }
    @Override
    public void startCourse() {
        System.out.println("Welcome to the Science Course: " + courseName);
    }
    @Override
    public void conductQuiz() {
        System.out.println("Conducting quiz for Science Course.");
    }
}
// ArtsCourse subclass 
class ArtsCourse extends Course implements Interactive {
    public ArtsCourse(String courseName, int courseCode) {
        super(courseName, courseCode);
    }
    @Override
    public void startCourse() {
        System.out.println("Welcome to the Arts Course: " + courseName);
    }
    @Override
    public void conductQuiz() {
        System.out.println("Conducting quiz for Arts Course.");
    }
}
// TechnologyCourse subclass
class TechnologyCourse extends Course implements Interactive {
    public TechnologyCourse(String courseName, int courseCode) {
        super(courseName, courseCode);
    }
    @Override
    public void startCourse() {
        System.out.println("Welcome to the Technology Course: " + courseName);
    }
    @Override
    public void conductQuiz() {
        System.out.println("Conducting quiz for Technology Course.");
    }
}
// ProgrammingCourse sub subclass 
final class ProgrammingCourse extends TechnologyCourse { // multilevel inheritance
    public ProgrammingCourse(String courseName, int courseCode) {
        super(courseName, courseCode);
    }
    @Override
    public void startCourse() {
        System.out.println("Welcome to the Programming Course: " + courseName);
    }
}
// Main class 
public class OnlineEducationPlatform {
    public static void main(String[] args) {
        // Create specific course objects 
        ScienceCourse sc  = new ScienceCourse("BIOTECH", 4444);
        ArtsCourse ac = new ArtsCourse("history", 2213);
        TechnologyCourse tc = new TechnologyCourse("backend", 9988);
        ProgrammingCourse pc = new ProgrammingCourse("Java", 9087);
// methods calling 
        sc.startCourse();
        sc.conductQuiz();

       ac.startCourse();
      ac.conductQuiz();

       tc.startCourse();
       tc.conductQuiz();

        pc.startCourse();
        pc.conductQuiz();
    }
}
