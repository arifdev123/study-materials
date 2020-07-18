public class DivideByZeroFloatingType {
  public static void main(String args[]) {
   System.out.println(25/0.0); // This doesn't raise the exception but floating point types have a representation of infinity. So
  // it outputs "Infinity"
} }
