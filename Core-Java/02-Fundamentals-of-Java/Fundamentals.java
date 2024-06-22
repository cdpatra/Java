// ! <| Lecture 22 Fundamentals of Java |>
// ? => Keyword
// ? => Identifier
// ? => Variables (Data Members)
// ? => Literals (Constants)
// ? => DataTypes
// ? => Methods (member function)
// ? => Operators
// ? => Separators
// ? => Comments
// ? => OOPS etc...

// ! What is OOPS ?
// ^ OOPS is programming paradigm which relates the programming with our real
// ^life.
// !What is Object ?
// % Object represents the real world entity.
// % Object has 3 properties
// & 1. State or Attribute or Data Member
// & 2. Behaviour or Functionality or Member Function
// & 3. Identity.
// !What is Class ?
// * Class is characterization of similar types of object.
// ? In real world every object has state,behaviour and identity but in real
// ? world there are many objects having same state and behaviour, so
// ? in order to characterize these similar objects a unique name is takes from
// ? the real world and that word is called as class.
// & in short class is a logical characterization of similar type of objects
// % class custom/user-defined data structure or datatype.
// >> class is a template of object.

// ! What is keyword ?
// >> Keywords are the predefined reserved words whose meaning is pre-defined in
// >> any particular language or whose meaning is known by the compiler.
// * all the keywords in java are in lower case.

// ! What is Identifier ?
// ^ Identifiers are those concepts which are used to identify the name of
// ^ class, name of package, name of variable in a program.
// ! Rules to create identifier
// *-> Keyword can not be used as a identifier.
// *-> Cannot blank
// *-> white space not allowed
// *-> number are allowed but not from first position
// *-> underscore and dollar are allowed
// *-> But special symbols are not allowed.
// *-> Unique.
// ! Convention (Coding Standard)
// >>=> First letter of class should be in upper case. (System)
// >>=> First letter of any method should be in lower case.
// >>=> Static constants are all in upper case and underscore.(MAX_PRIORITY)
// >>=> Package name should be in lower case and reverse of the domain name.

// ! What is variable ?
// ? variable is a name given to the memory location.
// !Types of variables
// % 1. Static variables or Static Data members or Class variables.
// % 2. Non-Static / Instance variables or Data Members
// % 3. Local Variables.

// ! What is Datatype ?
// ? Datatype are those concepts which explain the following information
// >>=> Type of the variable.
// >>=> Size of the variable.
// >>=> Range of the variable.
// ! Types of datatype
// *-> Primitive data types
// *-> Non-Primitive data types
// ! Logical type of datatype
// % 1. signed (+,-)
// % 2. unsigned (+) {IN JAVA THERE IS NO UNSIGNED}

// ! IN JAVA THERE IS NO CONCEPT OF GARBAGE VALUE, THE DEFAULT VALUE OF
// ! PRIMITIVE DATA TYPE IS 0 AND NON-PRIMITIVE DATA TYPE IN NULL AND CHARACTER
// ! IS BLANK AND ITS UNICODE VALUE IS \U0000 AND BOOLEAN IS FALSE.

// ! EVERY VARIABLE HAS DEFAULT VALUE BUT LOCAL VARIABLES DOES NOT HAVE DEFAULT
// ! VALUE THEREFORE THEY MUST BE INITIALIZED AS THEY WERE DECLARED OTHERWISE IT
// ! IS ERROR, AND IF LOCAL VARIABLE ARE DECLARED WITHOUT INITIALIZED THEN THEY
// ! SHOULD NOT BE USED

// ! Different types of data types
// byte
// short
// int
// float
// double
// boolean
// char
// String

// ! What is the use of byte datatype?
// ? byte data type is used for networking purpose, and we cannot do arithmetic
// ? operations on byte type datatype.

// ! What are literals ?
// ^ in Java programming language constants are called as literals.
// & there are two types of literals in java
// >>-> primitive literals (eg. 10, true, 'a', 10.5f)
// >>-> reference/non-primitive literal. ("hello")

// ! What is method ?
// ^ method in java is a self executed block in which we write all the logics
// ^ and these logics can be used again and again.
// ? methods represents the behaviour of any object.
// % there is 3 types of logic
// >>=> Presentation Logic (eg. UI design logic)
// >>=> Business Logic (eg. Functionality)
// >>=> Data Logic (eg. Database functionality)
/*
 * class Trainee {
 * 
 * }
 */
//& if we compile the above code then there will not be any error
/*
 * class Trainee{
 * System.out.println("Hello world");
 * }
 */
// &if we compile the above code then it will give error because logics can only
// &be written inside a method only in java.
// % There are two types of methods
// ? 1. User-Defined
// ? 2. Pre-Defined

// ! What are separators ?
// >> Separators are those symbols which separates any class, method, block etc...
// * eg. ; , () [] {} . 