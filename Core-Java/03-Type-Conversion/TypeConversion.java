// ! <| Lecture 34 Type conversion |>
// ^ It is the process of converting one type of data into another type.

// ! There are two types type conversion
// & 1. Type Promotion (implicit approach)
// * Type promotion is the process of converting one type of data to another type implicitly by java itself.
// % Once we have data and data does not found their exact match so one data is implicitly to another type.
// ! RULE >>===>> byte --> short --> int --> long
// & 2. Type Casting (explicit approach , narrowing)

// % Data types are of two types, primitive and non-primitive
// ? Primitive is also of three types Integral, Floating, Boolean
// >>=> Integral 
// * Integral is further divided into two types integral and character
// integral -> { byte(1byte), short(2byte), int(4byte), long(8byte) }
// character -> { char(2byte) }
// >>=> Floating
// floating -> { float(4byte), double(8byte) }
// >>=> Boolean
// boolean(1byte/N.A.)

// ! RULE >>===>> By default in java all the integer literal are treated as int data type and floating literal are treated as double data type.

class TypeConversion {
   static void show(byte b) {
      System.out.println("byte=" + b);
   }

   static void show(short b) {
      System.out.println("short=" + b);
   }

   static void show(int b) {
      System.out.println("int=" + b);
   }

   static void show(long b) {
      System.out.println("long=" + b);
   }

   public static void main(String[] args) {
      // float f = 10.5f; //& here to use float literals in java we have to give a
      // & prefix "f" as by default floating numbers are considered as double

      show(23); // output-> int=23;
   }
}