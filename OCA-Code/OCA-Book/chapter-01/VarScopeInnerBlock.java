public class VarScopeInnerBlock { 
 public void eactIFHungry(boolean hungry) {
  if(hungry) {
   int bitesOfCheese = 1;
   {
    boolean teenyBit = true;
    System.out.println(bitesOfCheese);
   }
  }
  System.out.println(teenyBit); // DOES NOT COMPILE - CE : cannot find symbol . symbol : variable teenyBit location class VarScopeInnerBlock
}
}// If the closing brace of the class is missed, then it is CE : reached end of file while parsing