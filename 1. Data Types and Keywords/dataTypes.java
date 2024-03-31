public class dataTypes {
//    single line comments
    /*  block style comments */
    /** documentation style comments */

/*    A type identifies a set of values (and their representation in memory) and a set of operations that transforms
    these values into other values */

//    java is strongly typed language

//    there are two types of data types
//    1. Primitive Types
//    2. User-defined Types

//    Examples of primitive datatype
    boolean aBoolean;   // size-> implementation dependent
    char aChar;     //size-> 16bits (stores unicode)
    byte abyte;     //size-> 8 bits
    short aShort;   //size-> 16 bits
    int anInt;      //size-> 32bits
//    integer constant consists of a sequence of digits
//    integer constant can be specified in the decimal, hexadecimal, octal or binary format
        int decimal=127;
        int hex=0x7f;
        int oct=0177;
        int binary=0b01101100;
    long aLong;     //size-> 64bits
//    if the constant is to represent a long integer value, it must be suffixed with an uppercase L or lowercase l
//    if no suffix the constant represents 32-bit integer (an int)
    float aFloat;   //size-> 32bits
//    if the constant is to represent a float value, it must be suffixed with a lowercase f
    double aDouble;     //size-> 64bits
}
