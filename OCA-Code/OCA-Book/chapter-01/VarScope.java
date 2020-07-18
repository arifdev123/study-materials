public class VarScope {
 public void eactIfHungry(boolean hungry) {
  if(hungry) {
   int bitesOfCheese = 1;
  } // bitesOfCheese goes out of scope here
  System.out.println(bitesOfCheese); // DOES NOT COMPILE CE : cannot find symbol
 }
}
