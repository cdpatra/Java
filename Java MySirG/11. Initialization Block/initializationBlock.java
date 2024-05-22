public class initializationBlock {
//    There are two types of initialization blocks
//    1. instance initialization block.
//    2. static initialization block
}

class test{
    private int x;
//    INSTANCE INITIALIZATION BLOCK
    {
        System.out.println("initialization block x="+x);
        x=5;
    }
    /* instance initialization block runs when we create any object, there can be more than one initialization
    * blocks in a class, compiler will convert all initialization block into single block and also maintains the
    * original sequence of the blocks,
    * after than compiler will write the initialization block's coding at the starting of the constructor*/

//    IMPORTANT POINTS REGARDING INSTANCE INITIALIZATION BLOCK
//      -=> an instance initializer or initialization block declared in a class is executed when an instance
//          of the class is created.
//      -=> return keyword cannot be used in initialization block.
//      -=> instance initializers are permitted to refer to the current object via the keyword "this" and to
//          use the keyword "super"
    public test(){
        System.out.println("constructor: x="+x);
    }

//    STATIC INITIALIZATION BLOCK
    private static int k;
    static{
    System.out.println("static initialization block k="+k);
    k=10;
    }
    /* we can make more than one static initialization block, compiler will combine them into a single
    * static initialization block, whenever use this class first time, then this class will be initialized
    * first time and this static block will run. Before the creation of first object, static initialization
    * block will be executed
    * static initialization block will run only one time*/

//    IMPORTANT POINTS REGARDING STATIC INITIALIZATION BLOCK
//        -=> a static initializer declared in a class is executed when the class is initialized
//        -=> static initializers may be used to initialize the class variables i.e. static variables of the class
//        -=> return keyword cannot be used in static initialization block
//        -=> this or super CANNOT be used in static block.
    public static void main(String[] args) {
        test t1 = new test();
        test t2 = new test();
    }
}