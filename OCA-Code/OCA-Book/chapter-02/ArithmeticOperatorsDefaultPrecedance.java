public class ArithmeticOperatorsDefaultPrecedance {
 public static void main(String... args) {
  int x = 2 * 5 + 3 * 4 - 8;
  System.out.println(x);
 }
}
/* 

The given expression follows default order of precendance.
For example, as per the precedancd table : 

 multiplicativ operators have high precedance over additive operators. 

step 1 : 10 + 12 - 8
step 2 : 22 - 8
step 3 : 14

O/P : 14
*/