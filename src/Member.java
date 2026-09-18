public record Member(String name, int memberNumber) {

    public String toString(){
        return "Medlem: " + name + "\nMedlemsnummer: " + memberNumber;
    }

    public int getId() {
        return memberNumber;
    }
}
