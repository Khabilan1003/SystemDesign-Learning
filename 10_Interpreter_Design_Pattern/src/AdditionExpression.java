public class AdditionExpression implements Expression{
    Expression left;
    Expression right;

    public AdditionExpression(Expression left , Expression right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public Integer interpret(Context context) {
        return left.interpret(context) + right.interpret(context);
    }
}
