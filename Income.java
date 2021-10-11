import java.util.Scanner;
public class Income
{
  public static void main(String args[])
  {
   Scanner in =new Scanner(System.in);
   System.out.print("Enter your income this month:");
   int x=in.nextInt();
   System.out.println(x);
   double a=0.55;
   a=a*x;
   double b=0.1;
   b=b*x;
   double c=0.1;
   c=c*x;
   double d=0.1;
   d=d*x;
   double e=0.1;
   e=e*x;
   double f=0.05;
   f=f*x;
   System.out.println((int)a);
   System.out.println((int)b);
   System.out.println((int)c);
   System.out.println((int)d);
   System.out.println((int)e);
   System.out.println((int)f);
  }
}
