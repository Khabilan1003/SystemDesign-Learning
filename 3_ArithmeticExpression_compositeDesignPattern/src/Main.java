public class Main {
    public static void main(String[] args) {
        // 2 + 5 * 8
        Number x = new Number(2);
        Number y = new Number(5);
        Number z = new Number(8);

        Expression expression1 = new Expression(Operation.MULTIPLY , y , z);
        Expression expression2 = new Expression(Operation.ADD, x , expression1);

        System.out.println(expression2.evaluate());
    }
}