public class overloading {
    /* if two methods of a class (whether both declared in the same class, or both inherited by a class,
    * or one declared and one inherited have the same name but signatures that are not same, then the
    * method name is said to be overloaded */
//    function signature means function's name and arguments not the return type

//  method overloading is a way to implement polymorphism


}

class A
{
    public void f1( int x)
    {
        System.out.println("Class A");
    }
}
class B extends A
{
    public void f1(int x, int y)
    {
        System.out.println("Class B");
    }
}
class example1{
    public static void main(String[] args) {
        B obj = new B();
        obj.f1(5);
        obj.f1(3,4);        // in java, it is function overloading but in C++ it is function hiding i.e. child class
                                  // will hide the parent's class function and not allow the obj of child class to access
                                  // parent's version
//        if both the function i.e. public void f1(int x) and public void f1(int x , int y) lie in either in class A or
//        in class B, it will also known as function overloading
    }
}
