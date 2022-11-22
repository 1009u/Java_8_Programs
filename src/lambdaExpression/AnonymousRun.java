package lambdaExpression;

public class AnonymousRun {
    public static void main(String[] args) {
        // without lambda
        Anonymous obj=new Anonymous() {
            @Override
            public void show() {
                System.out.println("Hello From Anonymous.");
            }

            @Override
            public void time(double x) {
                System.out.println("At the movement Time is :"+x);
            }

        };
        obj.show();
        obj.time(11.45);



    }
}
