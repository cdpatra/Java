// ! <<===================<< What is Java >>====================>>
// * High level Object oriented Programming Language.
// * It is also a platform
// * It is also a technology.
// * It is platform independent language.
// * It is server independent language.

// ! <| Features of Java |>
// ~ Simple
// ~ Secure
// ~ Platform Independent
// ~ Portable
// ~ Robust
// ~ Multithreaded
// ~ Distributed
// ~ Open Source

// ! <| 3 concepts of Object Oriented Approach |>
// & 1. Object Oriented
// Object oriented programming languages are those programming languages which has all the characteristics of Object Oriented Programming Concepts 
// (eg. Simula, C++, Java)
// & 2. Object Based
// Object based programming languages are those programming languages which does not supports the concept of run-time polymorphism and the concept of inheritance.
// (eg. JavaScript, PHP)
// & 3. Pure Object Oriented
// Pure object oriented programming language is a programming language in which everything is represented as  Objects
// (eg. Small Talk)
// * Java is not pure object Oriented programming language because everything in java is not represented in the form of object, as primitive data types in java is not represented in the form of objects. But Java is better than pure because it has flexibility, as we can use object in replacement of primitive data type by using wrapper classes in java.
// ?? why java supports the primitive data type, the reason is that we can perform arithmetic operations of primitive data type, if everything in java is objects then we cannot perform arithmetic operations on objects
// % Another reason that java is not a pure object oriented programming language is that java has "static" keyword which is independent of objects.

// ! we can create a java program by two ways
// *With IDE
// i.e. eclipse, netbeans, myeclipse, I.J
// * Without IDE
// i.e. JDK, editor, cmd

class introduction {
   public static void main(String[] args) {
      System.out.println("Hello World");
   }
}

// ! Micro-controller VS Micro-Processor
// ~ Micro-controller can process as well store the data
// & Micro-processor can only process the data and cannot store the data.

// ! types of programming languages
// % 1. low level programming languages.
// (e.g- Machine Language, Assembly Language)
// % 1. middle level programming languages.
// (e.g- C)
// % 1. high level programming languages.
// (e.g- COBOL, FORTRAN, PASCAL, B, CPL, BCPL, Simula, C++, java)

// ! Translators
// >> 1. Assembler
// >> 2. Compiler
// >> 3. Interpreter

// ! JAVA IS COMPILED AS WELL AS INTERPRETED PROGRAMMING LANGUAGE WHILE C/C++ IS
// ! ONLY COMPILED PROGRAMMING LANGUAGE

// ! Approaches to develop a software
// * Procedural Oriented (eg. C)
// * Object Oriented (eg. Simula, C++, Java)
// * Aspect Oriented (spring (java framework))

// ! IF C++ AND JAVA BOTH ARE OBJECT ORIENTED PROGRAMMING LANGUAGE THEN WHY JAVA
// ! IS PREFERRED MORE OVER C++

// *-> C++ was platform dependent programming language but Java is platform
// * independent, it is the major point due to which java is superior than C++.
// (platform:- it is the place or runtime environment on which our program is
// going to be executed, it could be a hardware(Processor) or software(O.S) or
// combination of both.)
// ?? a language is called to be platform independent if it supports CORA
// ?? (Compile Ones and Run Anywhere) Means program compile on one platform and
// ?? can be executed on any platform without changing their "object code".

// *-> Because there is various problems in C++, due to the concepts of pointers
// *in C++ the program made from C++ is not very secure.

// *-> exception handling in C++ is not done implicitly but in Java it is done
// *implicitly.

// *-> C++ supports operator overloading which increases the complexity but java
// *does not supports the operator overloading, operator overloading in java is
// *done implicitly we cannot do explicitly.

// *-> in C++ the management of memory have to be done explicitly, but in Java
// *there is garbage collection which performs the memory management
// *automatically.

// ! What is API
// ?? Set of inbuilt libraries and predefined functionalities in any language is
// ?? called is API. The form of API changes languages to languages.
// In C/C++ API's are in the form of header files
// In Java API's are in the form of Classes, Interfaces and Packages.

// ! What is JVM, JRE & JDK ?
// & JVM (Java Virtual Machine) :-
// * JVM is abstract virtual machine or software program which contains the
// * implementation of JRE and library files which is in the form of class
// * library files.
// * and it is the combination of
// ? 1. JVM SRS
// ? 2. JVM API
// ? 3. JVM Implementation (also called as JRE)
// ? 4. JVM Documentation.
// ^ the actual implementation is JRE and the concept is the JVM.

// & JRE (Java Runtime Environment) :-
// * JRE is the platform of java and it is visible physically when we install
// * java but JVM is not visible physically
// % JRE is platform dependent, for different OS we have to download different
// % JRE software, and this JRE software of different platform makes the java
// % platform independent as they can understand the byte code of java.

// & JDK (Java Development Kit) :-
// * JDK is the complete software of Java, it contains java compiler, libraries
// * of java, JRE, JVM etc.

// ! What is byte code
// % Byte code is the highly optimized set of instruction code created be java
// % compiler with help of JRE, this code is Unique and Universal (U&U) can be
// % run on any machine but in order to run it we need JRE for the particular
// % platform on which we want to run.
// * when byte code is generated with the help of JRE it contains several
// * characters which are mapped to each character of source code and each
// * character requires 1 byte memory space therefore it is called as byte code

// ! Java program is also interact with the hardware but it interact it during
// ! runtime not in compile time, during compile time it interacts with the JRE.

// ! What is path ?
// >> it is implicit environment variable.

// ! What is portable ?
// >> it means Write Once and Run Anywhere (WORA) means source file can be
// >> easily carry to one platform to another platform.

// ! How java is simple ?
// *=> Syntactically similar to c/c++
// *=> Java support OOPS and OOPS supports real world it is easy to connect with
// * real world
// *=> Java does not supports the pointers explicitly.
// *=> Java does not supports operator overloading.
// *=> Java does not have destructor, java implicitly releases the unused memory
// * with the help of Garbage Collector (Garbage Collector is a Thread).

// ! How java is secure ?
// >>=> Because we can't use pointer explicitly.
// >>=> Byte Code verification using magic number.
// >>=> Program run inside virtual machine sandbox.
// >>=> Security Manager.
// >>=> Many More Security can applied on java application like-
// ? JCA/JCE (Java Cryptography Architecture & Java CryptoGraphy Extensions)
// ? JSSE (Java Secure-Sockets Extension)

// ! Execution model of C/C++ program
// & STEP 1-> Executable file is ready (.exe)
// & STEP 2-> Run the executable file.
// & STEP 3-> First of all the this executable is read by OS and then its format
// &is checked by OS
// & STEP 4-> If the format is valid, executable file is loaded in to memory.
// & STEP 5-> Then processor executes the program.

// ! Execution model of java program.
// ^ STEP 1 -> Byte code is ready (.class)
// ^ STEP 2 -> Run the .class file
// ^ STEP 3 -> First of all this .class file is read by JRE and then its format
// ^is checked by JRE.
// ^ STEP 4 -> If the format is valid .class file is loaded in to the memory by
// ^class loader on a separate thread called main.
// ^ STEP 5 -> Linking (verify, prepare and execute)
// ^ STEP 6 -> Initialization, then execution is done by execution (JIT)
// ^ STEP 7 -> Then Processor executes the program.

// ! How java is Robust.
// ? java is robust due to 2 features
// >> Java has run time exception handling.
// >> Java has automatic garbage collection.

// ! How java is Architectural Neutral
// % because java program does not depends on the architecture of the hardware
// % or software, here in java the size of data type does not vary across the
// % different platform but in c/c++ size of data types depends on the type of
// % compiler and the architecture of the processor.

// ! How java is multithreaded ?
// >> java supports multithread programming by creating multiple threads
// >> therefore it is multithreaded language.

// ! How java is distributed ?
// ? Java language has capability to create a distributed softwares. Distributed
// ? softwares are made with RMI, EJB, and web-service.