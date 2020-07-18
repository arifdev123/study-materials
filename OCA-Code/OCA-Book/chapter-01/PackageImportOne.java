

//import java.util.Random;

public class PackageImportOne {
 public static void main(String[] args) {
   Random r = new Random();
   System.out.println(r.nextInt(10));
 } 
}

/*
 JVM does not have any clue to find out the class called Random. An import statement can sort this out if its package name is known.
 
 Uncommenting the above import statement will resolve this error.
 
 Typos also may lead you to this error so double check the spelling of the classes used in the program.

*/