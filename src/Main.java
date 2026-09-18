void main() {
//    Book harryPotter = new Book("J.K Rowling","Harry Potter", "KSVGVB", 1);
//    IO.println(harryPotter);
//
//    IO.println("---------------");
//
//    Book vanedyr = new Book("Nicklas Brendborg", "Vanedyr", "HDVGHN", 2);
//    IO.println(vanedyr);
//
//    IO.println("---------------");
//    IO.println();
//
//    final String ANSI_RED = "\u001B[31m";
//    final String ANSI_GREEN = "\u001B[32m";
//    final String ANSI_RESET = "\u001B[0m";
//
//
//    Member member1 = new Member("Martin Sejer", 111);
//    Member member2 = new Member("Christina Ulriksen", 112);
//    Loan loan1 = new Loan(harryPotter, member1, LocalDate.now().plusDays(14));
//    IO.println(loan1);
//
//    Library library1 = new Library();
//        library1.addBook(harryPotter);
//        library1.addBook(vanedyr);
//        library1.addMember(member1);
//        IO.println();
//        library1.addMember(member2);
//        IO.println();
//        library1.printAllMembers();
//        IO.println();
//        library1.printAllBooks();
//
//        //Books
//        Book foundBook = library1.getBook(2); // Fra metoden getBook()
//        IO.println(foundBook);
//
//        Book notFoundBook = library1.getBook(3); //Checker ID som hashset
//        IO.println(notFoundBook);
//        IO.println();
//
//        //Members
//        Member memberFound = library1.getMember(112);
//        IO.println(memberFound);
//        IO.println();
//
//        Member memberNotFound = library1.getMember(117);
//        IO.println(memberNotFound);
//
//        // Fra loanBook() metode
//        IO.println();
//        IO.println("Borrow book: " + library1.loanBook(2,112));
//        IO.println("Borrow book " + library1.loanBook(1, 112));
//
//        IO.println();
//
//        IO.println("Return book: " + library1.returnBook(1));
//
//
//        IO.println();
//
//    IO.println(library1.loanBook(2,112));
//        IO.println(library1.findLoansByMemberId(112));



    //Menu:
    Library library = new Library();
    ConsoleUI consoleUI = new ConsoleUI(library);

    Book vanedyr = new Book("Nicklas Brendborg","Vanedyr", "AAAAAMK", 1);
    Book dune = new Book("Frank Herbert", "Dune", "BBBBBMK", 2);
    Book artOfWar = new Book("Sun Tzu", "Art Of War", "CCCCCMK", 3);
    Book lesMiserables = new Book("Victor Hugo", "Les Miserables","DDDDDMK", 4);

    Member member1 = new Member("Klaus Lund", 111);
    Member member2 = new Member("Sezer Cöl", 222);
    Member member3 = new Member("Laura Bech", 333);
    Member member4 = new Member("Ian Bridgwood", 444);

    library.addBook(vanedyr);
    library.addBook(dune);
    library.addBook(artOfWar);
    library.addBook(lesMiserables);

    library.addMember(member1);
    library.addMember(member2);
    library.addMember(member3);
    library.addMember(member4);

    consoleUI.run();

}
