public class Number implements ArithmeticExpression{
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int evaluate() {
        System.out.println("Number: " + number);
        return number;
    }
}
