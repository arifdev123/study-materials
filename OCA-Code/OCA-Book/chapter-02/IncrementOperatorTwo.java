public class IncrementOperatorTwo {
 public static void main(String args[]) {
  int x = 10; 
 // int y = ++10; // CE : unexpected type. //increment or decrement operators can not operate on literals
 // System.out.println(y);
 // int z = --1; // CE : unexpected type. //increment or decrement operators can not operate on literals
 // System.out.println(z);

 // int w = ++ (++x); // CE: unexpected type. // listing of increment and decrement operators are not allowed.
 // System.out.println(w);

  // final int s = 10;
  // System.out.println("init: " + ++s); // CE : cannot assign a value to final variable
  
  char ch = 'a';
  ch++;
  System.out.println(ch);

  double dbl = 10.5;
  dbl++;
  System.out.println(dbl);

  boolean bln = false;
  bln++;
  ++bln;
  bln--;
  --bln;
  System.out.println(bln);

  
 }
}

/*
IncrementOperatorTwo.java:4: error: unexpected type
  int y = ++ 10;
             ^
  required: variable
  found:    value

IncrementOperatorTwo.java:6: error: unexpected type
  int z = --1;
            ^
  required: variable
  found:    value

IncrementOperatorTwo.java:24: error: bad operand type boolean for unary operator '++'
  bln++;
     ^
IncrementOperatorTwo.java:25: error: bad operand type boolean for unary operator '++'
  ++bln;
  ^
IncrementOperatorTwo.java:26: error: bad operand type boolean for unary operator '--'
  bln--;
     ^
IncrementOperatorTwo.java:27: error: bad operand type boolean for unary operator '--'
  --bln;
  ^

*/