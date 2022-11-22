package lambdaExpression;

//we will create interface here
interface MathOperation{
    int opt(int x, int y);
}
public class CalculatorLambda {
    //we will crete method here
    public static void result(int x, int y, MathOperation obj){
        System.out.println(obj.opt(x, y));
    }
    public static void main(String[] args) {
       result(98,78,(a,b)->(a-b));
    }
}
