public class Main {
    public static void main(String[] args) {
        // a + ( b * c )
        // a = 3 , b = 4 , c = 5
        Context context = new Context();
        context.put("a" , 3);
        context.put("b" , 4);
        context.put("c" , 5);
        Expression a = new NumberExpression("a");
        Expression b = new NumberExpression("b");
        Expression c = new NumberExpression("c");

        Expression multiply = new MultiplyExpression(b , c);
        Expression add = new AdditionExpression(a , multiply);

        System.out.println(add.interpret(context));
    }
}