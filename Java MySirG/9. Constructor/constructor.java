public class constructor {

//    -=> constructor is a member function of a class
//    -=> the name of constructor is same as the name of the class.
//    -=> constructor has no return type.
//    -=> a constructor is a special method that is used to initialize a newly created object and is called
//        implicitly, just after the memory is allocated for the object.
//    -=> it is not mandatory for the coder to write a constructor for the class.
//    -=> WHEN THERE IS NO CONSTRUCTOR DEFINED IN TEH CLASS BY PROGRAMMER, COMPILER IMPLICITLY PROVIDE A
//        DEFAULT CONSTRUCTOR FOR THE CLASS.
//    -=> constructors can be parameterized.
//    -=> constructors can be overloaded.
}
class box{
    private int l,b,h;

    public box() { }    // default constructor (compiler implicitly provide this constructor)
    public box()
    {
        l=10;
        b=8;
        h=4;
    }
    public box(int L, int B, int H)     // parameterised constructor
    {
        l=L;
        b=B;
        h=H;
    }

    public static void main(String[] args) {
        box b1 = new box();
        box b2 = new box(20,15,5);
    }
}
