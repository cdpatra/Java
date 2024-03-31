public class overriding {
    /* method overriding is defining a method in subclass with the same signature with specific
    * implementation in respect to the subclass.*/
}

class a{
    public void f1 (int x)
    {
        System.out.println("Class a");
    }
}
class b extends a{
    public void f1 (int x)
    {
        System.out.println("Class b");
    }
}
class example2{
    public static void main(String[] args) {
        b objb =  new b();
        objb.f1(5);

        a obja = new a();
        obja.f1(5);
    }
}
