package collections.lambdaExpression;

interface A{
    void show ();
}
public class LambdaDemo {
    public static void main(String[] args) {
//        OVERRIDING THE INTERFACE METHOD WITHOUT USING THE IMPLEMENTS KEYWORD

//        BY USING ANONYMOUS CLASS
        A anonymous = new A(){
            public void show (){
                System.out.println("Overriding the the show method of interface A using anonymous class");
            }
        };
        anonymous.show();

//        BY USING LAMBDA EXPRESSION
        A lambda = ()->
        {
                System.out.println("Overriding the the show method of interface A using lambda expression");
        };
        lambda.show();
    }
}
