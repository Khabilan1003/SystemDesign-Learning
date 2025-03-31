public class Expression implements ArithmeticExpression{
    private Operation operation;
    private ArithmeticExpression leftExpression;
    private ArithmeticExpression rightExpression;

    public Expression(Operation operation, ArithmeticExpression leftExpression, ArithmeticExpression rightExpression) {
        this.operation = operation;
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    public Operation getOperation() {
        return operation;
    }

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public ArithmeticExpression getLeftExpression() {
        return leftExpression;
    }

    public void setLeftExpression(ArithmeticExpression leftExpression) {
        this.leftExpression = leftExpression;
    }

    public ArithmeticExpression getRightExpression() {
        return rightExpression;
    }

    public void setRightExpression(ArithmeticExpression rightExpression) {
        this.rightExpression = rightExpression;
    }

    @Override
    public int evaluate() {
        int left = leftExpression.evaluate();
        int right = rightExpression.evaluate();
        return switch (operation) {
            case ADD -> left + right;
            case SUBTRACT -> left - right;
            case DIVIDE -> left / right;
            case MULTIPLY -> left * right;
        };
    }
}
