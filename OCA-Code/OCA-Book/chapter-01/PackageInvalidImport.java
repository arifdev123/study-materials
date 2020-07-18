
//import java.nio.*.*; // first import statement
//import java.util.Random.*; // second import statement
//import java.util.Random.next;  // third import statement
import java.util.Random.next;  // fourth import statement

public class PackageInvalidImport {
	public static void main(String args[]) {
		
		Random rdm = new Random(10);
		
		System.out.println(rdm.nextInt());
		
	}
}
/* first import statement : tries to import by using two wildcard symbols. but only one wildcard is allowed in an import statement at the last. But in this case, compiler expects a semi-colon immediately after the first occurence of the wildcard. 

second import statement : is trying to import the methods in the  Random class using wildcard. This is not allowed in java. We are getting cannot find symbol class Random due to the use of wildcard after the class name in the import statement. In this case , removing the .* will resolve this issue.

second import statement : it is trying to import a method next() from the java.util.Random class using a method name. It results in the error CE cannot find symbol in the import statiment. In this case, removing the .next will help resolve this issue.



*/