import java.util.Scanner;
public class p10
{
 public static void main(String args[])
 {
  Scanner s1= new Scanner(System.in);
  System.out.println("Enter a number :");
  int n = s1.nextInt();
  long fact = 1;

  int i=1;
  while(i<=n)
  {
   fact = fact*i;
    i++;
  }
 System.out.println("Factorial of " + n + "!" + " = " + fact);
 }
}