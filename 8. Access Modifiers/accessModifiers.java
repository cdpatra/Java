public class accessModifiers {
//    java supports four categories of accessibility rules
//        -> private
//        -> protected
//        -> public
//        -> default

//    modifiers can be used for class, member variables and member functions

//    WITH CLASS
//      -=> outer class and inner class
//      -=> for outer class, there can be only two possibilities, either class is a public class or just a
//          class which means it is of default type.
//      -=> for inner class any among four access modifiers can be used.

//          REMEMBER
//            -=> there can be only one public class in a single java file.
//            -=> the name of the java file must be the same as the name of the public class.
//            -=> only public class can be accessed directly from outside the package.

//    WITH MEMBER VARIABLES AND FUNCTIONS
//       -=> when members of the class are private, they can not be accessed from outside the class body.
//           they are meant to be accessed from the same class in which they are declared.
//       -=> when members are protected, they can be accessed from any class of the same package and child
//           class from other package.
//       -=> when members are public, they ae accessible from any class of any package.
//       -=> when members are default, they are accessible only from the class of same package.
}
