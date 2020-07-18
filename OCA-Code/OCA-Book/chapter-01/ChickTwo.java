/*
INITIALIZER : BLOCK of Instance and Static

1. Class loads into the memory.
2. static blocks are executed in the order as they appear.
3. Instance initializer blocks are executed in the order as they appear in the code.
4. main() method starts.
5. When instantiating the same class in which main() lives, the constructor invoked. 
6. Remaining set of codes are then executed.

At the time of instantiation of the class, the class executes in the following order : 

1. Fields are evaluated / declared
2. Instance initializers are executed in the order as they appear in the code.
3. Then the main method is invoked 
4. Then the constructor is called.

*/


public class ChickTwo { 
 static { System.out.println("This is static block one : at the begining of the class");}
 private String name = "Fluffy";
 { System.out.println("Instance Initializer Block one - after setting the field. \n name = "+name); }
 static { System.out.println("This is static block two : after setting the field.");}
 public ChickTwo() {
  name = "Tiny";
  System.out.println("Setting constructor. \n name = "+name);
 }
 { System.out.println("Instance Initializer Block two - after the constructor"); }
 static { System.out.println("This is static block three : after the constructor.");}
 public static void main(String... args) {
  System.out.println("Main is being started");
  ChickTwo c2 = new ChickTwo();
  System.out.println("In main method : after new statement.");
  
  System.out.println("In main method : End of main()");
 }
 static { System.out.println("This is static block four : after setting the main() but before the last instance initlzrs.");}
 
 { System.out.println("Instance Initializer Block one - after setting the main()"); }
 static { System.out.println("This is static block five : after the last instance initializer.");}
}

