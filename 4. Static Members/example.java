public class example {
    int x;  //instance variable
    static int y;   //static member variable

    public void fun1() {    //instance member function
        static int a;   //ERROR instance member function cannot have static local variable
    }
    public static void fun2(){      //static member function
        y=4;    //static member function can only access static members of the same class.
    }

//    static inner class
    static class test{
        public static String country= "india";
}

    public static void main(String[] args) {
        example ex1=new example();

//        how to access static members
        example.y=5;
        y=10;   //since main is static function therefore it can access static variable directly.
        example.fun2();

//        how to access static inner class
        System.out.println(example.test.country);
    }

}
