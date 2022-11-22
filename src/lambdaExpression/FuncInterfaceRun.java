package lambdaExpression;

public class FuncInterfaceRun  {
    public static void main(String[] args) {
        FunctionalinterfaceDemo fuctrun;
        fuctrun = () -> {
            System.out.println("Functional Interface calling from Lambda Expression.");
        };
        fuctrun.massage();
    }
}
