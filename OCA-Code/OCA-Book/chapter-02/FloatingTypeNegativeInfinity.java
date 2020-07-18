public class FloatingTypeNegativeInfinity {
 public static void main(String[] args) {
  System.out.println(-10.0/0); // O/P : -Infinity  : Final result type is double in this case. As the expression is negated, the result would be negative infinity.
  // So, java.lang.Double and java.lang.Float classes represent the negative infinity.
} }
