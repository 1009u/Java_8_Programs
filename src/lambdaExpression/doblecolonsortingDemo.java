package lambdaExpression;

interface double_colon{
    void demo_colon();
}

class DoubleColonSortingDemo {
   public void Hello(){
       System.out.println("Hello With the help of Double Colon as Lambda.");
   }

    public static void main(String[] args) {
        double_colon obj= () -> {
            System.out.println("Print with Lambda Expression.");
        };
        obj.demo_colon();
    }
}
