//example of how to create package directly from java program
/* to do that we have to pass some other command line arguments so that it can create package own its own*/
// javac -d . helloWorld.java
/* to run the .class file from world package use the following command*/
// java world.helloWorld

package world;
public class helloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
    }
}

// REMEMBER
//  -> we can have only one public class in a single java file.
//  -> name of the file should be same as teh name of public class
//  -> in absence of public class, any class name can be given to the file name.
