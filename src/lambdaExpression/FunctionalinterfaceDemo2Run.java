package lambdaExpression;

public class FunctionalinterfaceDemo2Run {
    public static void main(String[] args) {
        FuctionIntDemo2 fuctionIntDemo2= b-> {
            System.out.println(b);
        };
        fuctionIntDemo2.greet("Functional use with parameter in by Lambda.");
    }
}
