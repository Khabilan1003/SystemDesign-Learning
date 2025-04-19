public class NumberExpression implements Expression{
    String value;

    public NumberExpression(String value) {
        this.value = value;
    }

    @Override
    public Integer interpret(Context context) {
        return context.get(value);
    }
}
