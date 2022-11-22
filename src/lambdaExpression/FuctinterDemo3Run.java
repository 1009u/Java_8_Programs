package lambdaExpression;

public class FuctinterDemo3Run {
    public static void main(String[] args) {
        FuncInterfaceDemo3 addition= (a,b)-> a+b;
        System.out.println(addition.add(23,34));
    }
}
