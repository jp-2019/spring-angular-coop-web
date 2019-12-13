public class StrategyDemo {
    public static void main(String[] args) {
        Context c = new Context(new Addition());
        System.out.println(c.executeStrategy(5,8));


        Context c1 = new Context(new Multiplication());
        System.out.println(c1.executeStrategy(5,8));

        Context c3 = new Context(new Subtraction());
        System.out.println(c3.executeStrategy(5,8));
    }
}
