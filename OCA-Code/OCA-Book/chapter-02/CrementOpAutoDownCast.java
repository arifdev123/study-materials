public class CrementOpAutoDownCast {
 public static void main(String args[]) {
  byte b = 20; 
  b++; // This doesn't raise CE because the compiler down casts the result of higher type to the type of var at LHS.
  // Unlike in b = b + 1; 
 } }
