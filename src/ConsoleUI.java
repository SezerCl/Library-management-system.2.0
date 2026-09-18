import java.util.ArrayList;

public class ConsoleUI {
    public Library library;

    public ConsoleUI(Library library){
        this.library = library;
    }

    public void run(){
        boolean running = true;
        while (running){
                showMenu();
                int choice = Integer.parseInt(IO.readln("Indtast venligst valgmulighed: "));
                switch (choice){
                    case 1 -> borrowBack();
                    case 2 -> returnBook();
                    case 3 -> showLoans();
                    case 4 -> showAllBooks();
                    case 0 -> running = false;
                    default -> IO.println("Ugyldigt valg." + "\n" + choice);
                }
        }
    }

    private void showMenu(){
        IO.println();
        IO.println("1. Lån");
        IO.println("2. Aflever");
        IO.println("3. Dine lån");
        IO.println("4. Vis alle bøger");
        IO.println("0. Afslut");
        IO.println();
    }

    private void borrowBack(){
        int bookId = Integer.parseInt(IO.readln("Indtast venligst bogens ID: "));

        int memberId = Integer.parseInt(IO.readln("Indtast venligst medlemsnummer: "));

        boolean udlånt = library.loanBook(bookId, memberId);
        Book book = library.getBook(bookId);

        if (udlånt) {
            IO.println("Bogen " + book.title() +  " er nu udlånt.");
        }
        else {
            IO.println("Bogen kunne ikke lånes.");
        }
    }

    private void returnBook(){
        int bookId = Integer.parseInt(IO.readln("Indtast venligst ID på den lånte bog: "));

        boolean aflever = library.returnBook(bookId);
        Book book = library.getBook(bookId);

        if (aflever == true){
            IO.println("Du har nu afleveret følgende bog: " + book.title() + ". Tak for nu (:");
        }
        else {
            IO.println("Bogen kunne ikke afleveres");
        }
    }

    private void showLoans(){
        int memberId = Integer.parseInt(IO.readln("Indtast venligst dit medlemsnummer: "));

        ArrayList<Loan> visLån = library.findLoansByMemberId(memberId);

        if (visLån.isEmpty()){
            IO.println("Du har ingen lånte bøger");
        }
        else {
            for(Loan loan : visLån){
                IO.println(loan);
            }
        }
    }

    private void showAllBooks(){
        IO.println("Alle bøger:");
        IO.println();
        library.printAllBooks();
    }
}
