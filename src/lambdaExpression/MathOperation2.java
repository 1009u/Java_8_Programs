package lambdaExpression;

interface Operation{
  int ope(int x, int y);
}
public class MathOperation2 {
    public static void result(int x , int y, Operation obj){
        System.out.println(obj.ope(x,y));
    }
    public static void main(String[] args) {
        result(89,99,(a,b) -> (a*b));
    }
}
