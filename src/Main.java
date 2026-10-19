void main() {
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
