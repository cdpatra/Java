public class commandLineArguments {
//    a java application can accept any number of arguments from the command line.
public static void main(String[] args) {    //here, Strings[] args is the array of type string which can store the command line arguments
//   if command line arguments are strings
//    for(int i=0;i<args.length;i++)
//        System.out.println(args[i]);

//    if command line arguments are numbers then we can use the function of wrapper class to convert string into int
    int sum=0;
    for(int i=0;i<args.length;i++)
        sum=sum+Integer.parseInt(args[i]);
    System.out.println("sum is "+sum);
}
}
