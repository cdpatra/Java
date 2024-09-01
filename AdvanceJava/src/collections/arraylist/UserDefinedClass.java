package collections.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Emp {
    String name;
    String cmpName;
    int age;
    Emp(String name, String cmpName, int age)
    {
        this.name=name;
        this.cmpName= cmpName;
        this.age=age;
    }

    public String toString (){
        return name+" "+cmpName+" "+age;
    }

    void show(){
        System.out.println(name+" "+cmpName+" "+age);
    }
}
public class UserDefinedClass {
    public static void main(String[] args) {
        Emp e1= new Emp("Chinam", "SoleTechStop", 21);
        Emp e2= new Emp("Patra", "SoleTechStop", 22);
        Emp e3= new Emp("Dibyadyuti", "SoleTechStop", 23);

        ArrayList<Emp> empList = new ArrayList<Emp>();
        empList.add(e1);
        empList.add(e2);
        empList.add(e3);

        System.out.println(empList);
        System.out.println();

        Iterator<Emp> iterator = empList.iterator();
        while(iterator.hasNext())
        {
            Emp emp = iterator.next();
            emp.show();
        }
        System.out.println();

    }
}
