public class IntegerTypeUndefinedResult {
  public static void main(String... args) {
  System.out.println(0/0);// RE : ArithmeticException: / by zero
  /*
    In general math, 0/0 is undefined. But in java, there is no way to represent a undefined result in case of Integer type. So, the RE is thrown.

  */
} }
