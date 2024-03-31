public class box {
//    example of classes and object
    private int length,breadth,height;
    public void setDimentions(int l, int b, int h)
    {
        length=l;
        breadth=b;
        height=h;
    }
    public void showDimentions()
    {
        System.out.println("L="+length);
        System.out.println("B="+breadth);
        System.out.println("H="+height);
    }
}
//NOTE:- A SINGLE JAVA FILE CAN CONTAIN ONLY ONE PUBLIC CLASS
class example{
//    in C++
//    box b1;
//    box *p=new box();
public static void main(String[] args) {
    //    in java
    box smallBox=new box();     //here smallBox is a variable of type box but it not an object
                                //smallBox is a reference variable which reference to the object which does not
                                //have its name and created dynamically.
    smallBox.setDimentions(12, 10, 5);
    smallBox.showDimentions();

    smallBox=new box();         //here a new dynamically created object is referenced by the smallBox and
                                //the previous object is handled by garbage collector;
    smallBox.showDimentions();
}


}
