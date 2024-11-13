class MedicalHistory {
    private String diagnosis;  // Private attribute for encapsulation
    private String treatment;  
    // Constructor 
    public MedicalHistory(String diagnosis, String treatment) {
        this.diagnosis = diagnosis;
        this.treatment = treatment;
    }
    // Getter 
    public String getDiagnosis() { return diagnosis; }
    public String getTreatment() { return treatment; }
    // Setter 
    public void setDiagnosis(String diagnosis) { this.diagnosis = diagnosis; }
    public void setTreatment(String treatment) { this.treatment = treatment; }
}

class Patient {
    public int patientId; 
    public int age;        
    //composition relationship with MedicalHistory 
    public MedicalHistory patientMedHistory;  // i.e patient ke bina med hist ka koi mtlb ni
    // Constructor 
    public Patient(int patientId, int age, MedicalHistory patientMedHistory) {
        this.patientId = patientId;
        this.age = age;
        this.patientMedHistory = patientMedHistory;
    }
}
class Appointment {
    public String appointmentDate;  
    public String appointmentTime;  
    // Method to schedule an appointment with only a date
    public void schedule(String date) {
        appointmentDate = date;
        appointmentTime = ""; 
    }
    // Method to schedule an appointment with both date and time
    public void schedule(String date, String time) {   //overloading
        appointmentDate = date;
        appointmentTime = time;
    }
}
// Represents a doctor in the hospital, associated with multiple patients and appointments (Aggregation)
class Doctor {
    public int doctorId;  // 
    public String specialization;  
    public Appointment[] appointments;  // Array of appointments (Aggregation)
    public int appointmentCount;  // Count for added appointments

    // Constructor to initialize doctor ID and specialization
    public Doctor(int doctorId, String specialization) {
        this.doctorId = doctorId;
        this.specialization = specialization;
        appointments = new Appointment[10]; // size fixedd
        appointmentCount = 0; // count
    }
    // Method to add an appointment to the doctor's appointment array (Aggregation)
    public void addAppointment(Appointment x) {
        if (appointmentCount < appointments.length) { // Check
            appointments[appointmentCount] = x; // Add appointment
            appointmentCount++; 
        } else {
            System.out.println("No available slots for new appointments."); 
        }
    }
}
// Driver class 
public class HospitalManagementSystem {
    public static void main(String[] args) {
    
        MedicalHistory medHistory = new MedicalHistory("brain tumor", "brain surgery");
       
        Patient patient = new Patient(2203, 20, medHistory); 
        // Display patient details
        System.out.println("Patient ID: " + patient.patientId);
        System.out.println("Patient Age: " + patient.age);
        System.out.println("Diagnosis: " + patient.patientMedHistory.getDiagnosis());
        System.out.println("Treatment: " + patient.patientMedHistory.getTreatment());
        // Create a Doctor object
        Doctor doctor = new Doctor(1991, "Oncologist-surgeon");
        // Create Appointment objects 
        Appointment appointment1 = new Appointment();
        appointment1.schedule("2025-10-04"); // Scheduling with just a date
        Appointment appointment2 = new Appointment();
        appointment2.schedule("2025-21-08", "10:00 AM"); // Scheduling with date and time
        // Add the appointments to the doctor's schedule
        doctor.addAppointment(appointment1);
        doctor.addAppointment(appointment2);
        // Display doctor details with specialization
        System.out.println("\nDoctor ID: " + doctor.doctorId);
        System.out.println("Doctor Specialization: " + doctor.specialization);
        System.out.println("First Appointment Date: " + doctor.appointments[0].appointmentDate);
        System.out.println("First Appointment Time: " + doctor.appointments[0].appointmentTime);
        System.out.println("Second Appointment Date: " + doctor.appointments[1].appointmentDate);
        System.out.println("Second Appointment Time: " + doctor.appointments[1].appointmentTime);
    }
}
