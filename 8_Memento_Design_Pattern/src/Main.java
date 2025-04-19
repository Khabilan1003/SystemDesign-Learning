public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();
        Originator originator = new Originator();

        originator.setHeight(10);
        originator.setWidth(20);
        caretaker.addHistory(originator.createMemento());

        originator.setHeight(20);
        originator.setWidth(30);
        caretaker.addHistory(originator.createMemento());

        originator.setHeight(40);
        originator.setWidth(50);
        originator.restoreMemento(caretaker.undo());

        System.out.println("Height : " + originator.getHeight());
        System.out.println("Width : " + originator.getWidth());
    }
}