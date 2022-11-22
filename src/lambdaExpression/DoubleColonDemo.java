package lambdaExpression;

//create a interface
interface doubleColonPrint{
     void statement();
}
public class DoubleColonDemo {
    public void display() {
        System.out.println("Print Double colon Statement.");
    }
    public static void main(String[] args) {
        doubleColonPrint obj= new DoubleColonDemo() :: display;
        obj.statement();
            }
        }


