
import java.util.Date;
import java.util.Date;

public class LocalVarIfBlock {
 public static void findAnswer(boolean check) {
 int answer;
 int onlyOneBranch;
 if(check) {
  onlyOneBranch = 1; 
  answer = 1;
 } else {
  answer = 2; 
  onlyOneBranch = 7; 
 }
 System.out.println(answer);
 System.out.println(onlyOneBranch);
 }
 public static void main(String[] args) {
		findAnswer(false);
 }
}