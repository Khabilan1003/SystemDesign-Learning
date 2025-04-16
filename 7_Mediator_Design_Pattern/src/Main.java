public class Main {
    public static void main(String[] args) {
        Mediator mediator = new MediatorImpl();

        Collegue collegue1 = new CollegueImpl("Khabilan", mediator);
        Collegue collegue2 = new CollegueImpl("Khavya", mediator);
        Collegue collegue3 = new CollegueImpl("Vishnu", mediator);

        collegue1.placeBid(1000.0);
        collegue2.placeBid(2000.0);
        collegue3.placeBid(3000.0);
    }
}