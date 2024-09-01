package collections.arraylist;
import java.util.ArrayList;
import java.util.Iterator;


//WHAT IS THE DIFFERENCE BETWEEN LIST AND ARRAYLIST
/*
 * -> Array can store only homogenous type of data but ArrayList can store both homogenous and heterogeneous
 * data
 * -> Array cannot increase its size dynamically but ArrayList can increase its size dynamically
 * -> we can initialize array with as well as without new keyword but ArrayList cannot be initialized without
 * new keyword. */

//WHAT IS ArrayList ??
/**
 * ArrayList is the concrete class or implementing class of the list interface whose one object is responsible
 * to create dynamic resizable array into the memory with initial capacity of 10. */

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList(); //Constructs an empty list with an initial capacity of ten.
        System.out.println(arrayList);
        arrayList.add("hello");
        arrayList.add("hello");
        arrayList.add(10);  // here add() can only take object as an input, and here 10 is automatically converted into
                            // objects with the help of autoboxing feature of java.
        arrayList.add(10.6);
        arrayList.add(10);
        System.out.println(arrayList);

//        THE INITIAL SIZE OF THE ARRAYLIST IS 10, AS WE ADD MORE THAN 10 ELEMENTS INTO THE ARRAY LIST
//        THE SIZE OF ARRAY DYNAMICALLY INCREASES

//        AS THE SIZE IS FULL, A NEW ARRAY IS CREATED WITH INCREASED CAPACITY, IT INCREASES BY THE 50% OF
//        ITS ACTUAL SIZE

        ArrayList arrayList1 = new ArrayList(2);
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList2.add("hi");
        arrayList2.add("bye");
        System.out.println(arrayList2);

        arrayList2.add(2,60);
        System.out.println(arrayList2);

        System.out.println("Is the arrayList2 is empty: "+arrayList2.isEmpty());

        System.out.println("Size of the arrayList2 is: "+ arrayList2.size());

        System.out.println(arrayList2.contains("hello"));

        System.out.println("Element at index 4 in arrayList2 is: "+arrayList2.get(4));

//        arrayList2.removeAll(arrayList);
//        System.out.println(arrayList2);

//        arrayList2.retainAll(arrayList);
//        System.out.println(arrayList2);

//        GETTING ELEMENTS FROM COLLECTIONS USING FOR LOOP
        for (int i=0;i<arrayList2.size();i++)
        {
            System.out.print(arrayList2.get(i)+" ");
        }
        System.out.println();

//        GETTING ELEMENTS FROM COLLECTIONS USING FOR EACH LOOP
        for(Object ele:arrayList2)
            System.out.print(ele+" ");
        System.out.println();

//        GETTING ELEMENTS FROM COLLECTIONS BY USING ITERATORS
        Iterator i = arrayList2.iterator();
        while(i.hasNext())
        {
            Object object = (Object) i.next();
            System.out.print(object+" ");
        }
        System.out.println();

        arrayList2.forEach((emp)-> System.out.print(emp+" "));
    }
}
