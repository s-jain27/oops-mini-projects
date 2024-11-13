
class Book {
    int bookNumber;     
    String bookname ; 
    String authorname ; 
    boolean isAvailable; 
    public Book(int bookNumber, String authorname ,String bookname ) {
        this.bookNumber = bookNumber;
        this.authorname=authorname;
        this.bookname=bookname;
        this.isAvailable = true; 
    }
    public void markBorrowed() {
        isAvailable = false; // Sets availability to false
    }
    public void markReturned() {
        isAvailable = true; // Sets availability to true
    }
}
class Member {
    int memberId;       
    Book borrowedBook;   
    // Constructor 
    public Member(int memberId) {
        this.memberId = memberId;
        this.borrowedBook = null; // No book borrowed initially
    }
    // Method to mark a book as returned 
    public void clearBorrowedBook() {
        borrowedBook = null; // Reset borrowed book to null
    }
}
// Class to represent a Loan status in the library
class Loan {
    boolean loan_status = false; // Loan status, false if no loan
   
    public void loan() {
        loan_status = true; // Sets loan status to true (active loan)
    }
}
// Main class for the Library Management System
public class LibraryManagementSystem {
    Book book = new Book(101, "hc verma" , "physics"); 
    Member member = new Member(1); 
    Loan loan = new Loan(); 

    // Method to handle borrowing a book 
    public void borrowBook() {
        // Check 
        if (book.isAvailable && member.borrowedBook == null && loan.loan_status==false) {
            book.markBorrowed();       // Mark the book as borrowed
            member.borrowedBook = book;  
            loan.loan();                 // Set loan status to active
            System.out.println(book.bookNumber+"  "+book.bookname+" By "+book.authorname+"   has been successfully borrowed");
        }
        else{ System.out.println();}
    }
    // Method to handle returning a book from a member
    public String returnBook() {
        book.markReturned();    
        member.clearBorrowedBook(); 
        loan.loan_status = false;  
        return " BOOK Returned successfully!";
    }
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        // Initialize arrays for borrow and return dates
        String[] borrowDates = {"01-03-2024"};
        String[] returnDates = {"12-12-2024"};
        
        library.borrowBook(); 
        System.out.println("Borrow Date: " + borrowDates[0]); // Display borrow date
        
        System.out.println(library.returnBook()); 
        System.out.println("Return Date: " + returnDates[0]); // Display return date
    }
}