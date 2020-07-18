public class OverrideDefaultPrecedance {
 public static void main(String[] args) {
  int x = 2 * ((5 + 3) * 4 - 8);
  System.out.println(x);
 }
}

/* 

In the given expression, paranthesises are used to override the 
default order of operator precedance. 

While evaluating the parenthesis, innermost pair is evaluated first and then outermost.

step 1 : 2 * (8 * 4 - 8)
step 2 : 2 * (32 - 8 )
step 3 : 2 * 24
step 4 : 48

*/