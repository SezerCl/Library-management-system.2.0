import java.util.ArrayList;
import java.time.LocalDate;

public class Library {
    private ArrayList<Book> books = new ArrayList<>();
    private ArrayList<Member> members = new ArrayList<>();
    private ArrayList<Loan> loans = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void addMember(Member member){
        members.add(member);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public ArrayList<Member> getMembers(){
        return members;
    }

    public ArrayList<Loan> getLoans(){
        return loans;
    }

    public void printAllBooks(){ // For-løkke til print
        for (Book book : books){
            IO.println(book);
        }
    }

    public void printAllMembers(){
        for (Member member : members){
            IO.println(member);
        }
    }

    public Book getBook(int bookId){
        for (Book book : books){
            if (book.id() == bookId){
                return book;
            }
        }
        return null;
    }

    public Member getMember(int memberNumber){
        for(Member member : members){
            if(member.getId() == memberNumber){
                return member;
            }
        }
        return null;
    }

    public boolean loanBook(int bookId, int memberId) {
        Book book = getBook(bookId);
        Member member = getMember(memberId);

        if (book == null || member == null) {
            return false;
        }

        for (Loan loan : loans) {
            if (loan.getBook().id() == bookId) {
                return false;
            }
        }

        Loan newLoan = new Loan(book, member, LocalDate.now());
        loans.add(newLoan);

        return true;
    }

    public boolean returnBook(int bookId) { //Return metode
        for (Loan loan : loans) { //Syntax for for-loop
            if (loan.getBook().id() == bookId){ //Her checkes der om bogen med specifikt id eksistere.
               loans.remove(loan); //Fjerner bogen fra loan<> arrayet
                return true; //"True", hvis det lykkedes
            }
        }
        return false; //Vice versa.
    }

    public ArrayList<Loan> findLoansByMemberId(int memberId) {
        ArrayList<Loan> sameLoans = new ArrayList<>();

        for (Loan loan : loans) {
            if (loan.getMember().getId() == memberId) {
                sameLoans.add(loan);
            }
        }

        return sameLoans;
    }
}

