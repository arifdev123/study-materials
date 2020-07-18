public class IntegralLiterals {
 public static void main(String[] args) {
  int i = 999;
  int b = 0B0101;
  int b2 = 0B0101;
  int h = 0X3eaf2;
  int o = 0745;
  System.out.println("decimal " + i);
  System.out.println("binary " + b);
  System.out.println("hexd  " + h);
  System.out.println("octal " + o);
  
  System.out.println(" Binary addition b + b2 = " + (b + b2));
 }
}
