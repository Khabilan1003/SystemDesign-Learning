public class Originator {
    private int height;
    private int width;

    public Originator() {}

    public Originator(int height , int width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void restoreMemento(Memento memento) {
        this.height = memento.getHeight();
        this.width = memento.getWidth();
    }

    public Memento createMemento() {
        return new Memento(this.height , this.width);
    }
}
