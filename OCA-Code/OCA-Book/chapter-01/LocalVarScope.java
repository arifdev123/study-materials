public class LocalVarScope {
public static void main(String[] args) {
 int y = 10;
 int x; // error: variable x might not have been initialized
 	//int z = x + y;
 	//        ^
 int z = x + y;
}
}
