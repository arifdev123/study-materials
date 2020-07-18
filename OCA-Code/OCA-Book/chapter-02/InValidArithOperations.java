public class InValidArithOperations {
 public static void main(String args[]) {
  int x = 10;
  boolean b = true;
 //  int sum = x + b; // CE : 

  String dummyString = "Some text " ;

 // String newString = dummyString + b * x ;  // CE :

  String anotherNewString = dummyString + b ;  //  Compiles fine. 

  System.out.println(anotherNewString );


  char initial = 'M';

 // String newName = initial + b; // CE

 
  //String anotherNewName = initial + x; // CE

  char anotherChar = 'A';

  //char result = initial - anotherChar; 
  System.out.println(initial - anotherChar);


 char intToChar = 77;
 System.out.println(intToChar);
 

 }}

/*

InValidArithOperations.java:5: error: bad operand types for binary operator '+'
  int sum = x + b;
              ^
  first type:  int
  second type: boolean
InValidArithOperations.java:9: error: bad operand types for binary operator '*'
  String newString = dummyString + b * x ;
                                     ^
  first type:  boolean
  second type: int

InValidArithOperations.java:18: error: bad operand types for binary operator '+'
  String newName = initial + b;
                           ^
  first type:  char
  second type: boolean
InValidArithOperations.java:21: error: incompatible types: int cannot be converted to String
   String anotherNewName = initial + x;
                                   ^
4 errors

*/
