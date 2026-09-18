

public record Book(String author, String title, String ISBN, int id) {


    public String toString(){

        return String.format("""
        Author: %s
        Title: %s
        ISBN: %s
        id: %d
        """, author, title, ISBN, id);

    }


}
//    public boolean loanBook(Member member) {
//        if (isAvailable()){
//            borrowedBy = member;
//            borrowedDate = LocalDate.now();
//            return true;
//        }
//        return false;
//    }
//
//    public void returnBook(){
//        if (isAvailable()) {
//            IO.println("");
//            borrowedDate =  null;
//        }
//    }
//
//    public boolean isAvailable(){
//        return borrowedBy == null; //Bogen er ledig og true returneres. Hvis false returneres er bogen lånt af en member
//    }

//}
