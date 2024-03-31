//example of inheritance
public class example {
    public static void main(String[] args) {
        student s1 = new student();
        s1.setRollno(100);
        s1.setName("Rahul");
        s1.setAge(18);
        System.out.println("Roll no: "+s1.getRollno());
        System.out.println("Name: "+s1.getName());
        System.out.println("Age: "+s1.getAge());
    }
}
